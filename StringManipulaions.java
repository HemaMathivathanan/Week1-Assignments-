package week1.day2;

public class StringManipulaions {
	public static void main(String[] args) {
		String org = "test";
		String rev ="";
		int length = org.length();
		for(int i=length-1;i >=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("length is:" +length);
		if (org.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not pal");
		}
		System.out.println(org.toUpperCase());
	}

}
 