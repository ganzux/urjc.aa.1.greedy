package com.alcedomoreno.urjc.aa.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivityStore {

	public List<Activity> activities;
	
	public ActivityStore(){
		activities = new ArrayList<Activity>();
	}
	
	public void add( Activity activity ){
		activity.setId( activities.size() );
		activities.add( activity );
	}


	@SuppressWarnings("unchecked")
	public List<Activity> selectActivities(){

		List<Activity> copyList = new ArrayList<Activity>();
		copyList.addAll( activities );
		Collections.sort( copyList );
		
		List<Activity> notSolappedActivities = new ArrayList<Activity>();

		for ( Activity activity:copyList ){
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
