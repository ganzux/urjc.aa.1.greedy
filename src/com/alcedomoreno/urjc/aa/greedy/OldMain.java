package com.alcedomoreno.urjc.aa.greedy;

public class OldMain {

	public static void main( String[] args ) throws Exception{
		int[] c = {0,7,5,2,16,11,15,23,12,24};
		int[] f = {3,8,11,18,20,21,24,24,25,29};
		int[] i = {3,2,4,7,8,0,9,6,5,1};
		int w = 0;
		for ( boolean b:selecActividades(i, c, f) )
			System.out.println( w++ + "-" + b );
	}
	
	public static boolean[] selecActividades(int[] i, int[] c, int[] f) throws Exception{
		boolean[] s = new boolean[ c.length ];
		
		s[ i[0] ]= true;
		
		int x = 0;
		
		for ( int j=1; j<c.length; j++ ){

			if ( isInRange( f[j], f[x], c[j], c[x] ) ){
				s[ i[ j ] ] = true;
				x = j;
			} else
				s[ i[ j ] ] = false;
		}
		
		return s;
	}
	
	
	private static boolean isInRange( int a, int b, int c, int d ){
		return ( ( a > b && c > d ) ||
				( a == b && c > d ) );
	}
}
