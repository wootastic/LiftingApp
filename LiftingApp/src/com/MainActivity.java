package com;


import com.baxter.LiftingApp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ImageView newWorkoutBut = (ImageView) findViewById(R.id.newWorkoutBut);
		ImageView tempButton1 = (ImageView) findViewById(R.id.tempButton1);
		ImageView tempButton2 = (ImageView) findViewById(R.id.tempButton2);
		ImageView tempButton3 = (ImageView) findViewById(R.id.tempButton3);
		ImageView tempButton4 = (ImageView) findViewById(R.id.tempButton4);

		newWorkoutBut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new workout");
			}

		});

		tempButton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 1");
			}

		});

		tempButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 2");
			}

		});

		tempButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 3");
			}

		});

		tempButton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 4");
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void toast(String msg){
		Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
		toast.show();
	}

}