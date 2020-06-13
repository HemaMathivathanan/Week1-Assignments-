package week1.day1;

public class IntersectioninArray {

	public static void main(String[] args) {
		
	
	int [] array1 = new int[6];
	{
	
			array1[0] =3;
			array1[1] =2;
			array1[2] =11;
			array1[3] =4;
			array1[4] =6;
			array1[5] =7;
					
	}
	
	int array2[] = { 7,2,4,3,8,9 , 6 };
	for (int i= 0; i<array1.length ; i ++ ) 
	{
	for (int j = 0;j< array2.length ;j ++)
		{
			if ( array1[i] == array2[j])
		{ 
			System.out.println("matching arrays :  " +array1[i]);
			}
			
	
	}
}
	
	
			
	
}
}

