package com.steven.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edWeight;
    private EditText edHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得輸入方塊內資料，轉換成string
        edWeight = findViewById(R.id.ed_weight);
        edHeight = findViewById(R.id.ed_height);
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
        //浮現一下後消失
        Toast.makeText(this,"Your BMI is "+ bmi, Toast.LENGTH_LONG).show();
}
}
