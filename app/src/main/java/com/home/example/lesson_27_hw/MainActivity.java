package com.home.example.lesson_27_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton (View v){

        EditText e1 = (EditText)findViewById(R.id.num1);
        EditText e2 = (EditText)findViewById(R.id.num2);
        TextView resText = (TextView)findViewById(R.id.result);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));
    }
}