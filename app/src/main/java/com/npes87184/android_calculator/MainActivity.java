package com.npes87184.android_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btn10;
    private Button btnC;
    private Button btnPlus;
    private Button btnSub;
    private Button btnMul;
    private Button btnDiv;
    private Button btnAbout;
    private Button btnEqu;
    private TextView bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        bar = (TextView)findViewById(R.id.tv);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn8 = (Button)findViewById(R.id.button8);
        btn9 = (Button)findViewById(R.id.button9);
        btn0 = (Button)findViewById(R.id.button0);
        btn10 = (Button)findViewById(R.id.button10);
        btnPlus = (Button)findViewById(R.id.buttonPlus);
        btnSub = (Button)findViewById(R.id.buttonSubtract);
        btnMul = (Button)findViewById(R.id.buttonMul);
        btnDiv = (Button)findViewById(R.id.buttonDiv);
        btnEqu = (Button)findViewById(R.id.buttonEqu);
        btnAbout = (Button)findViewById(R.id.buttonAbout);
        btnC = (Button)findViewById(R.id.buttonC);
    }
}
