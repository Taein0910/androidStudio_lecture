package com.example.ti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    EditText et;
    Button back, clear, plus, minus, b7, b8, b9, mul, b4, b5, b6, div, b3, b2, b1, equal, dot, b0, plusMinu, close;
    double fn, sn;
    String operator;
    double result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et = (EditText) findViewById(R.id.et);
        back = (Button) findViewById(R.id.back);
        clear = (Button) findViewById(R.id.clear);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        mul = (Button) findViewById(R.id.mul);
        b6 = (Button) findViewById(R.id.b6);
        b5 = (Button) findViewById(R.id.b5);
        b4 = (Button) findViewById(R.id.b4);
        b3 = (Button) findViewById(R.id.b3);
        div = (Button) findViewById(R.id.div);
        b2 = (Button) findViewById(R.id.b2);
        b1 = (Button) findViewById(R.id.b1);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        b0 = (Button) findViewById(R.id.b0);
        plusMinu = (Button) findViewById(R.id.plusMinu);

        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        mul.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        div.setOnClickListener(this);
        b3.setOnClickListener(this);
        b2.setOnClickListener(this);
        b1.setOnClickListener(this);
        dot.setOnClickListener(this);
        b0.setOnClickListener(this);
        equal.setOnClickListener(this);
        plusMinu.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String string = et.getText().toString();
        switch (v.getId()) {
            case R.id.b0:
                et.setText(string + b0.getText());
                break;
            case R.id.b1:
                et.setText(string + b1.getText());
                break;
            case R.id.b2:
                et.setText(string + b2.getText());
                break;
            case R.id.b3:
                et.setText(string + b3.getText());
                break;
            case R.id.b4:
                et.setText(string + b4.getText());
                break;
            case R.id.b5:
                et.setText(string + b5.getText());
                break;
            case R.id.b6:
                et.setText(string + b6.getText());
                break;
            case R.id.b7:
                et.setText(string + b7.getText());
                break;
            case R.id.b8:
                et.setText(string + b8.getText());
                break;
            case R.id.b9:
                et.setText(string + b9.getText());
                break;
            case R.id.clear:
                et.setText("");
                break;
            case R.id.back:
                StringBuilder stB = new StringBuilder(string);
                stB.deleteCharAt(string.length() - 1);
                et.setText(stB.toString());
                break;
            case R.id.dot:
                et.setText(string + ".");
                break;
            case R.id.plus:
                operator = "+";
                fn = Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.minus:
                operator = "-";
                fn = Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.div:
                operator = "/";
                fn = Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.mul:
                operator = "*";
                fn = Double.parseDouble(et.getText().toString());
                et.setText("");
                break;
            case R.id.plusMinu:
                et.setText(Double.parseDouble(et.getText().toString())*(-1)+"");
                break;
            case R.id.equal:
                sn = Double.parseDouble(et.getText().toString());
                switch (operator) {
                    case "+":
                        result=fn+sn;
                        break;
                    case "-":
                        result=fn-sn;
                        break;
                    case "/":
                        result=fn/sn;
                        break;
                    case "*":
                        result=fn*sn;
                        break;

                }
               et.setText(result+"");
                break;
            case R.id.close:
                finish();
        }
    }
}
