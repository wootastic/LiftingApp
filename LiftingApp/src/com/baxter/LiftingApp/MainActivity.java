package com.baxter.LiftingApp;

import android.app.Activity;
import android.content.Intent;
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
				//Start a new workout
				Intent intent = new Intent(MainActivity.this, WorkoutActivity.class);
				startActivity(intent);
				//TODO Check if a workout was already started for today.  In order to override or keep old.  
			}

		});

		tempButton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 1");
				//TODO add functionality
			}

		});

		tempButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 2");
				//TODO add functionality
			}

		});

		tempButton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 3");
				//TODO add functionality
			}

		});

		tempButton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				toast("new temp 4");
				//TODO add functionality
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