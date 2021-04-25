package com.perceus.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView result, display;
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, add, clear, sub, multiply, divide, equals;
    final char ADD = '+';
    final char SUB = '-';
    final char MUL = '*';
    final char DIV = '/';
    final char EQUAL = '=';
    char ACTION;
    double val1 = Double.NaN;
    double val2 = Double.NaN;
    String process;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = (TextView) findViewById(R.id.result);
        TextView display = (TextView) findViewById(R.id.display);

        Button bu1 = (Button) findViewById(R.id.bu1);
        Button bu2 = (Button) findViewById(R.id.bu2);
        Button bu3 = (Button) findViewById(R.id.bu3);
        Button bu4 = (Button) findViewById(R.id.bu4);
        Button bu5 = (Button) findViewById(R.id.bu5);
        Button bu6 = (Button) findViewById(R.id.bu6);
        Button bu7 = (Button) findViewById(R.id.bu7);
        Button bu8 = (Button) findViewById(R.id.bu8);
        Button bu9 = (Button) findViewById(R.id.bu9);
        Button bu0 = (Button) findViewById(R.id.bu0);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button multiply = (Button) findViewById(R.id.clear);
        Button divide = (Button) findViewById(R.id.divide);

        Button clear = (Button) findViewById(R.id.clear);
        Button equals = (Button) findViewById(R.id.equal);

    }


        public void clear(View view){
            TextView result = (TextView) findViewById(R.id.result);
            TextView display = (TextView) findViewById(R.id.display);
            display.setText("");
            result.setText("");
            val1 = Double.NaN;
        }


        public void num (View view){
            TextView display = (TextView) findViewById(R.id.display);
            switch (view.getId()) {
                case R.id.bu1:
                    process = display.getText().toString();
                    display.setText(process + "1");
                    break;
                case R.id.bu0:
                    process = display.getText().toString();
                    display.setText(process + "0");
                    break;
                case R.id.bu2:
                    process = display.getText().toString();
                    display.setText(process + "2");
                    break;
                case R.id.bu3:
                    process = display.getText().toString();
                    display.setText(process + "3");
                    break;
                case R.id.bu4:
                    process = display.getText().toString();
                    display.setText(process + "4");
                    break;
                case R.id.bu5:
                    process = display.getText().toString();
                    display.setText(process + "5");
                    break;
                case R.id.bu6:
                    process = display.getText().toString();
                    display.setText(process + "6");
                    break;
                case R.id.bu7:
                    process = display.getText().toString();
                    display.setText(process + "7");
                    break;
                case R.id.bu8:
                    process = display.getText().toString();
                    display.setText(process + "8");
                    break;
                case R.id.bu9:
                    process = display.getText().toString();
                    display.setText(process + "9");
                    break;
            }
        }
        public void compute(){
            TextView result = (TextView) findViewById(R.id.result);
            TextView display = (TextView) findViewById(R.id.display);
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(display.getText().toString());
            switch (ACTION){
                case ADD:
                    val1 += val2;
                    break;
                case SUB:
                    val1 -= val2;
                    break;
                case MUL:
                    val1 *= val2;
                    break;
                case DIV:
                    val1 /= val2;
                    break;
                            }
        }
        else{
            val1 = Double.parseDouble(display.getText().toString());
        }

        }


    public void act(View view) {
        TextView result = (TextView) findViewById(R.id.result);
        TextView display = (TextView) findViewById(R.id.display);
        switch (view.getId()){
            case R.id.add:

                ACTION = ADD;
                compute();
                result.setText(String.valueOf(val1)+"+");
                display.setText(null);
                break;
            case R.id.sub:

                ACTION = SUB;
                compute();
                result.setText(String.valueOf(val1)+"-");
                display.setText(null);
                break;
            case R.id.multiply:

                ACTION = MUL;
                compute();
                result.setText(String.valueOf(val1)+"*");
                display.setText(null);
                break;
            case R.id.divide:

                ACTION = DIV;
                compute();
                result.setText(String.valueOf(val1)+"/");
                display.setText(null);
                break;
            case R.id.equal:

                compute();
                result.setText(String.valueOf(val1));
                display.setText(null);
                break;



        }
    }
}

