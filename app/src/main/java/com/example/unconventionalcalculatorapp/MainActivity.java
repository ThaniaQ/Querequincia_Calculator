package com.example.unconventionalcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtResult;
EditText txtNum1;
EditText txtNum2;
Button btnAdd;
Button btnSub;
Button btnDiv;
Button btnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(txtNum1.getText().toString());
                double input2 = Double.parseDouble(txtNum2.getText().toString());
                double sum = input1 + input2;

                txtResult.setText(String.valueOf(sum));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(txtNum1.getText().toString());
                double input2 = Double.parseDouble(txtNum2.getText().toString());
                double sum = input1 - input2;

                txtResult.setText(String.valueOf(sum));


            }

        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(txtNum1.getText().toString());
                double input2 = Double.parseDouble(txtNum2.getText().toString());
                double sum = input1 / input2;

                txtResult.setText(String.valueOf(sum));

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double input1 = Double.parseDouble(txtNum1.getText().toString());
                double input2 = Double.parseDouble(txtNum2.getText().toString());
                double sum = input1 * input2;

                txtResult.setText(String.valueOf(sum));
            }
        });
    }
}