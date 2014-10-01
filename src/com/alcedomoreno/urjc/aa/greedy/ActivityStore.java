package com.alcedomoreno.urjc.aa.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ActivityStore {

	public List<Activity> activities;
	
	public ActivityStore(){
		activities = new ArrayList<Activity>();
	}
	
	public void add( Activity activity ){
		activity.setId( activities.size() );
		activities.add( activity );
	}

	public List<Activity> selectActivities(){

		Queue<Activity> queue = new PriorityQueue<Activity>();
		queue.addAll( activities );

		List<Activity> notSolappedActivities = new ArrayList<Activity>();

		while( !queue.isEmpty() ){
			Activity activity = queue.remove();

			// we put the 1st one
			if ( notSolappedActivities.isEmpty() )
				notSolappedActivities.add( activity );

			// compare with the rest for avoid overlaped
			else
				if ( !activity.isOverlaped( notSolappedActivities ) )
					notSolappedActivities.add( activity );
		}

		return notSolappedActivities; 
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		for ( Activity activity:activities )
			sb.append( activity ).append("\r\n");
		
		return sb.toString();
	}
	
	public int size(){
		return activities.size();
	}
}
