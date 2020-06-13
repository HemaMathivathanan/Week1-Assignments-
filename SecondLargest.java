package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		

		int[] ar = {5,2,3,11};
		
	Arrays.sort(ar);
	int size = ar.length;
		
	//	System.out.println(Arrays.asList(data));
	
		System.out.println(Arrays.toString(ar));
		
		int result = ar[size-2];
		
		System.out.println(result);
//		int res = data[length-2];
		
		/*
		 * for ( int i=0;i<data.length;i++) {
		 * 
		 * if(i==(data.length-1)) {
		 * 
		 * System.out.println(data[i-1]); } }
		 */
   
	
	
	}
}
