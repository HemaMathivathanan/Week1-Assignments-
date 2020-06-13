package week1.day2;

public class OddindextoUpperCase {
public static void main(String[] args) {
	String test = "changeme";
	//int length = test.length();
	char[] a=test.toCharArray();
	
//	String res = "";
	for(int i=1; i<=a.length; i++)
	{
		int odd=0;
		odd = i%2;
		if(odd!=0)
		{
			
			a[i]=Character.toUpperCase(a[i]);
			System.out.println("result is " +a[i]);
		}
		
	}
}
}
