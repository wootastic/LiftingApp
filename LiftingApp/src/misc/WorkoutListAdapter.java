package misc;

import java.util.ArrayList;
import java.util.List;

import com.baxter.LiftingApp.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class WorkoutListAdapter extends BaseAdapter {
	
	private ArrayList<Workout> workouts = new ArrayList<Workout>();
	private final Context mContext;
	
	public WorkoutListAdapter(Context mContext) {
		this.mContext = mContext;
	}
	
	public void add(Workout item) {
		
		//TODO CHANGE THIS SO IT DOESN'T REPLACE OLD, MAYBE THROUGH ERROR MESSAGE
		if (workouts.contains(item)) {
			workouts.remove(item);
			workouts.add(item);
		} else {
			workouts.add(item);
		}
		notifyDataSetChanged();
	}
	
	public void remove(Workout item) {
		workouts.remove(item);
		notifyDataSetChanged();
	}
	
	public List<Workout> getList() {
		return workouts;
	}
	
	public void setList(ArrayList<Workout> items) {
		workouts = items;
		notifyDataSetChanged();
	}
	
	public void clear() {
		workouts.clear();
	}

	@Override
	public int getCount() {
		return workouts.size();
	}

	@Override
	public Object getItem(int position) {
		return workouts.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if (convertView == null) {
			//inflate layout
			LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.workout_layout, parent, false);	
		} 
		
		return convertView;
	}

}
