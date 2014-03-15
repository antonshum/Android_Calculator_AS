package com.example.hw02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button btn1 =null;
	private Button btn2 =null;
	private Button btn3 =null;
	private Button btn4 =null;
	private Button btn5 =null;
	private Button btn6 =null;
	private Button btn7 =null;
	private Button btn8 =null;
	private Button btn9 =null;
	private Button btn10 =null;
	private Button btn11 =null;	
	private Button btn12 =null;
	private Button btn13 =null;
	private Button btn14 =null;
	private Button btn15 =null;
	private Button btn16 =null;
	private Button btn17 =null;
	private TextView tv = null;
	String string;
	String lastString = null;
	String calString = null;
	int temp;
	float ftemp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.textView1);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		btn5 = (Button) findViewById(R.id.button5);
		btn6 = (Button) findViewById(R.id.button6);
		btn7 = (Button) findViewById(R.id.button7);
		btn8 = (Button) findViewById(R.id.button8);
		btn9 = (Button) findViewById(R.id.button9);
		btn10 = (Button) findViewById(R.id.button10);
		btn11 = (Button) findViewById(R.id.button11);
		btn12 = (Button) findViewById(R.id.button12);
		btn13 = (Button) findViewById(R.id.button13); 
		btn14 = (Button) findViewById(R.id.button14); 
		btn15 = (Button) findViewById(R.id.button15);
		btn16 = (Button) findViewById(R.id.button16); 
		btn17 = (Button) findViewById(R.id.button17); 
		btn1.setOnClickListener(bltisener);
		btn2.setOnClickListener(bltisener);
		btn3.setOnClickListener(bltisener);
		btn4.setOnClickListener(bltisener);
		btn5.setOnClickListener(bltisener);
		btn6.setOnClickListener(bltisener);
		btn7.setOnClickListener(bltisener);
		btn8.setOnClickListener(bltisener);
		btn9.setOnClickListener(bltisener);
		btn10.setOnClickListener(bltisener);
		btn11.setOnClickListener(bltisener);
		btn12.setOnClickListener(bltisener);
		btn13.setOnClickListener(bltisener);
		btn14.setOnClickListener(bltisener);
		btn15.setOnClickListener(bltisener);
		btn16.setOnClickListener(bltisener);
		btn17.setOnClickListener(bltisener);
	}
	
	private Button.OnClickListener bltisener = new Button.OnClickListener(){
		@Override
		public void onClick(View V) {
			if(((Button)V).getText().toString().equals("¡ö")) {
				if(tv.getText().toString().length()==1) {
					tv.setText("0");
				}
				else {
					tv.setText(tv.getText().toString().substring(0, tv.getText().toString().length()-1));
				}
			}
			else if(((Button)V).getText().toString().equals("C")) {
				tv.setText("0");
			}
			else if(((Button)V).getText().toString().equals("+")) {
				lastString = "+";
				string = tv.getText().toString();
//				tv.setText("0");
			}
			else if(((Button)V).getText().toString().equals("-")) {
				lastString = "-";
				string = tv.getText().toString();
//				tv.setText("0");
			}
			else if(((Button)V).getText().toString().equals("*")) {
				lastString = "*";
				string = tv.getText().toString();
//				tv.setText("0");
			}
			else if(((Button)V).getText().toString().equals("/")) {
				lastString = "/";
				string = tv.getText().toString();
//				tv.setText("0");
			}
			else if(((Button)V).getText().toString().equals("=")) {
				if(calString.equals("+")) {
					calString = null;
					temp = Integer.parseInt(string) + Integer.parseInt(tv.getText().toString());
					string = string.valueOf(temp);
					tv.setText(string);
				}
				else if(calString.equals("-"))	{
					calString = null;
					temp = Integer.parseInt(string) - Integer.parseInt(tv.getText().toString());
					string = string.valueOf(temp);
					tv.setText(string);
				}
				else if(calString.equals("*"))	{
					calString = null;
					temp = Integer.parseInt(string) * Integer.parseInt(tv.getText().toString());
					string = string.valueOf(temp);
					tv.setText(string);
				}
				else if(calString.equals("/"))	{
					calString = null;
					ftemp = (float)(Integer.parseInt(string)) / Integer.parseInt(tv.getText().toString());
					string = string.valueOf(ftemp);
					tv.setText(string);
				}
				else {								//direct use =
					tv.setText("0");
				}
			}
			else {
				if(lastString != null) {			//has enterded +-*/
					calString = lastString;
					lastString = null;
						tv.setText(((Button)V).getText().toString());
				}
				else {
					if(Integer.parseInt(tv.getText().toString())==0) {
						tv.setText(((Button)V).getText().toString());
					}
					else {
						tv.setText(tv.getText().toString() + ((Button)V).getText().toString());
					}
				}
			}
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
