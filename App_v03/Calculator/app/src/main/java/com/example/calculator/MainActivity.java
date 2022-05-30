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
        EditText e1 = findViewById(R.id.second_num);
        EditText e2 = findViewById(R.id.first_num);
        String num1_str =e1.getText().toString();
        String num1_str =e2.getText().toString();
        EditText result = findViewById(R.id.second_num2);
        int num1 = Integer.parseInt(num1_str);
        int num2 = Integer.parseInt(num2_str);
        switch (v.getId()) {
            case R.id.button3:
                int sum = num1+num2;
                String sum_str = Integer.toString(sum);
                result.setText(sum_str);
                break;
            case R.id.button4:
                int sub = num1-num2;
                String sub_str = Integer.toString(sub);
                result.setText(sub_str);
                break;
            case R.id.button5:
                int product = num1*num2;
                String product_str = Integer.toString(product);
                result.setText(product_str);
                break;
            case R.id.button6:
                int div = num1/num2;
                String div_str = Integer.toString(div);
                result.setText(div_str);
                break;
        }
    }


}