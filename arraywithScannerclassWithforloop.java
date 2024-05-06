package Array_problems;

import java.util.Scanner;

public class arraywithScannerclassWithforloop {

	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		
		int rollno[]=new int[3];
		
		for(int i=0;i<=3;i++)
		{
			rollno[i]=s2.nextInt();
			System.out.println("Array is" +rollno[i]);
			
		}


	}

}
