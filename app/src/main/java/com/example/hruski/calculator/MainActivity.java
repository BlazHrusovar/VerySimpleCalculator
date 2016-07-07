package com.example.hruski.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button plusButton, minusButton, multButton, divButton;
    EditText firstNum, secondNum;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        //Buttons
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        multButton = (Button) findViewById(R.id.multButton);
        divButton = (Button) findViewById(R.id.divButton);

        //Edit Text
        firstNum = (EditText) findViewById(R.id.firstNum);
        secondNum = (EditText) findViewById(R.id.secondNum);

        //Result
        result = (TextView) findViewById(R.id.result);


        //Click listeners
        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        multButton.setOnClickListener(this);
        divButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        String num1 = firstNum.getText().toString();
        String num2 = secondNum.getText().toString();

        switch(view.getId()){
            case R.id.plusButton:
                int plus = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(plus));
                break;
            case R.id.minusButton:
                int minus = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(minus));
                break;
            case R.id.multButton:
                int mult = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(mult));
                break;
            case R.id.divButton:
                try {
                    double div = Double.parseDouble(num1) / Double.parseDouble(num2);
                    result.setText(String.valueOf(div));
                }catch (Exception e){
                    result.setText("Can't divide");
                }
                break;
        }
    }
}
