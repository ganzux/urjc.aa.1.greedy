package com.alcedomoreno.urjc.aa.greedy;

import java.util.List;


public class Activity implements Comparable<Object>{
	
	private int init;
	private int end;
	private int id;

	public boolean isOverlaped( Activity other ){
		boolean overlaped = false;
		
		try{
			// is overlapped if the other init or end is inside my range
			if( isInRange( other.getInit() ) || isInRange( other.getEnd() ) )
				overlaped = true;
		}catch( Exception e ) {
			// nulls or other
		}
		
		return overlaped;
	}
	
	public boolean isOverlaped( List<Activity> others ){
		boolean overlaped = false;

		for ( Activity a:others )
			if ( isOverlaped( a ) )
				return true;

		return overlaped;
	}
	
	public Activity(int init, int end) throws Exception{
		if ( init > end )
			throw new Exception("End Time must be greatter than Init Time");
		this.init = init;
		this.end = end;
	}
	
	public boolean isInRange( int date ){
		return ( date > init && date < end );
	}
	
	public int compareTo(Object o) {
		Activity a = (Activity) o;

        if ( a.getEnd() < getEnd() )
        	return 1;
        if ( a.getEnd() == getEnd() )
        	return 0;
        else
        	return -1;
        
    }

	public int getInit() {
		return init;
	}

	public void setInit(int init) {
		this.init = init;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getLength(){
		return end - init;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return "Init: " + init + ", End: " + end + ", Id: " + id;
	}
	
}
