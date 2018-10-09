package com.steven.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bmi(View view){
        Log.d("MainActivity" , "bmi");
        //取得輸入方塊
        EditText edWeight = findViewById(R.id.ed_weight);
        EditText edHeight = findViewById(R.id.ed_height);
        //取得輸入方塊內資料，轉換成string
        String w = edWeight.getText().toString();
        String h = edHeight.getText().toString();
        Log.d("MainActivity" , w + "/" + h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity" , bmi +"");
    }
}
