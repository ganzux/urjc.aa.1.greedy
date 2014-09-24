package com.alcedomoreno.urjc.aa.greedy;

public class OldMain {

	public static void main( String[] args ) throws Exception{
		int[] c = {0,7,5,2,16,11,15,23,12,24};
		int[] f = {3,8,11,18,20,21,24,24,25,29};
		int i = 0;
		for ( boolean b:selecActividades(c, f) )
			System.out.println( i++ + "-" + b );
	}
	
	public static boolean[] selecActividades(int[] c, int[] f) throws Exception{
		boolean[] s = new boolean[ c.length ];
		
		s[ 0 ] = true;
		
		int i = 0;
		
		for ( int j=1; j<c.length; j++ ){

			if ( !isInRange( c[j],c[i],f[i] ) && !isInRange( f[j],c[i],f[i] ) ){
				s[ j ] = true;
				i = j;
			} else
				s[ j ] = false;
		}
		
		return s;
	}
	
	private static boolean isInRange( int date, int init, int end ){
		return ( date > init && date < end );
	}
}
