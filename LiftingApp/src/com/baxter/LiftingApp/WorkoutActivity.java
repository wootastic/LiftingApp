package com.baxter.LiftingApp;

import java.util.ArrayList;

import misc.Workout;
import misc.WorkoutListAdapter;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

public class WorkoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workout);
		
		ListView listView = (ListView) findViewById(R.id.workoutList);
		View footerView = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.footerview_workout, null, false);
		listView.addFooterView(footerView);
		
		
		Workout w1 = new Workout("deadlift");
		Workout w2 = new Workout("test");
		Workout w3 = new Workout("test1");
		Workout w4 = new Workout("test3");
		Workout w5 = new Workout("test2");
		Workout w10 = new Workout("deadlift");
		Workout w6 = new Workout("test");
		Workout w7 = new Workout("test1");
		Workout w8 = new Workout("test3");
		Workout w9 = new Workout("test2");
		WorkoutListAdapter wla = new WorkoutListAdapter(this);
		wla.add(w1);
		wla.add(w2);
		wla.add(w3);
		wla.add(w4);
		wla.add(w5);
		wla.add(w6);
		wla.add(w7);
		wla.add(w8);
		wla.add(w9);
		wla.add(w10);
		
		
		listView.setAdapter(wla);
		
	}
}
