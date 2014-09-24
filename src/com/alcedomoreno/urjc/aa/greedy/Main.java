package com.alcedomoreno.urjc.aa.greedy;

import java.util.List;

public class Main {

	public static void main( String[] args ) throws Exception{
		ActivityStore as = new ActivityStore();
		
		as.add( new Activity(11,21) );	// 0
		as.add( new Activity(24,29) );	// 1
		as.add( new Activity(7,8) );	// 2
		as.add( new Activity(0,3) );	// 3
		as.add( new Activity(5,11) );	// 4
		as.add( new Activity(15,25) );	// 5
		as.add( new Activity(23,24) );	// 6
		as.add( new Activity(2,18) );	// 7
		as.add( new Activity(16,20) );	// 8
		as.add( new Activity(15,24) );	// 9
		
		List<Activity> myAct = as.selectActivities();
		
		// INIT LIST:
		System.out.println( myAct );

		// Not Solapped List
		for ( Activity a:myAct)
			System.out.println( a );
		
		// for the teacher
		boolean[] out = new boolean[ as.size() ];

		for ( int i=0;i<out.length;i++ )
			out[ i ] = false;
		for ( Activity a:myAct )
			out[ a.getId() ] = true;

		for ( int i=0;i<out.length;i++ )
			System.out.println("[" + i + "] -> " + out[ i ]);
	}
}
