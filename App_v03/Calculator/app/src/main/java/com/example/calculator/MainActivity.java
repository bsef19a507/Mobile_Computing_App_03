package com.example.calculator;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,aboutme.class);
                startActivity(intent);
            }
        });
    }

    public void calculate(View v){
        EditText num1_str = findViewById(R.id.second_num);
        EditText num2_str = findViewById(R.id.first_num);
        int num1 = Integer.parseInt(num1_str);
        int num2 = Integer.parseInt(num2_str);
        switch (v.getId()) {
            case R.id.button3:
                int sum = num1+num2;
                break;
            case R.id.button_two:
                // do something else
                break;
            case R.id.button_three:
                // i'm lazy, do nothing
                break;
        }
    }


}