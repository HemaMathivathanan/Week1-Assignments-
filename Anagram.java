package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		int a , b ;
		String test1= "stops";
		String test2= "potts";
		a = test1.length();
		b = test2.length();
	 {
			System.out.println(a);
			System.out.println(b);
			
	if ( a == b ) {
		
char[] charArray = test1.toCharArray();
char[] charArray2 = test2.toCharArray();

Arrays.sort(charArray);
Arrays.sort(charArray2);
System.out.println(charArray);	
System.out.println(charArray2);
	if(charArray.equals(charArray2))
	{
		System.out.println("same");
	}else
	{
		System.out.println("no");
	}
			
	}
	 }
	}
}
	
	
		
		
	

