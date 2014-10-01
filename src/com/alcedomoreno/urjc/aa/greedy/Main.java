package com.alcedomoreno.urjc.aa.greedy;

import java.util.List;

public class Main {

	public static void main( String[] args ) throws Exception{
		ActivityStore as = new ActivityStore();
		
		as.add( new Activity(0,1) );	// 0
		as.add( new Activity(4,5) );	// 1
		as.add( new Activity(3,5) );	// 2
		as.add( new Activity(3,10) );	// 3
		as.add( new Activity(7,13) );	// 4
		as.add( new Activity(1,4) );	// 5
		as.add( new Activity(7,12) );	// 6
		as.add( new Activity(3,9) );	// 7
		as.add( new Activity(6,8) );	// 8
		
		List<Activity> myAct = as.selectActivities();
		
		// INIT LIST:
		System.out.println( "Original List" );
		System.out.println( as );

		System.out.println( "\n\nGreedy Algorithm" );
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
