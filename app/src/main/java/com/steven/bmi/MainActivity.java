package com.steven.bmi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        //取得輸入方塊內資料，轉換成string
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Mainactivity", "onClick: help");
                new AlertDialog.Builder(MainActivity.this)
                    .setTitle(R.string.what_is_bmi)
                        .setMessage(R.string.bmi_information)
                        .setPositiveButton(R.string.ok,null)
                        .show();
            }
        });
    }

    public void bmi(View view){
        Log.d("MainActivity" , "bmi");
        //取得輸入方塊
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Log.d("MainActivity" , w + "/" + h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity" , bmi +"");

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("BMI",bmi);
        startActivity(intent);

        //toast對話框浮現一下後消失
//        Toast.makeText(this,"Your BMI is "+ bmi, Toast.LENGTH_LONG).show();
        //AlertDialog對話框 ：按ok後消失
//        new AlertDialog.Builder(this)
//            .setTitle(R.string.bmi)
//                .setMessage(getString(R.string.your_bmi_is) + bmi)
//                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//        @Override
//        public void onClick(DialogInterface dialog, int which) {
//            edWeight.setText(" ");
//            edHeight.setText(" ");
//        }
//    })
//            .show();
}
}
