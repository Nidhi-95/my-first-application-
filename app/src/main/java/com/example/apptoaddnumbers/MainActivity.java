package com.example.apptoaddnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etnum1;
    private EditText etnum2;
    private TextView tvAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnum1 = (EditText) findViewById(R.id.etnum1);
        etnum2 = (EditText) findViewById(R.id.etnum2);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);


    }

    public void btnADD(View view) {
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum1.getText().toString());
        int Answer = num1 + num2;
        tvAnswer.setText(String.valueOf(Answer));

    }

    public void btnSUB(View view) {
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum1.getText().toString());
        int Answer = num1 - num2;
        tvAnswer.setText(String.valueOf(Answer));
    }
    public void btnMUL(View view) {
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum1.getText().toString());
        int Answer = num1 * num2;
        tvAnswer.setText(String.valueOf(Answer));

    }
    public void btnDIVIDE(View view) {
        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum1.getText().toString());
        int Answer = num1 / num2;
        tvAnswer.setText(String.valueOf(Answer));
    }


}