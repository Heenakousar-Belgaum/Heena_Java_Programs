package Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class toArraysAreEqualsToEachOther {

	public static void main(String[] args)
	{
Scanner s2=new Scanner(System.in);
		
		int rollno[]=new int[2];
		
		for(int i=0;i<=2;i++)
		{
			rollno[i]=s2.nextInt();
			System.out.println(rollno[i]);
			
		}
	  
		int rollno1[]=new int[2];
		for(int i=0;i<=2;i++)
		{
			rollno[i]=s2.nextInt();
			System.out.println(rollno1[i]);
		}

if(Arrays.equals(rollno,rollno1))
{
	System.out.println("Arrays are equal)");
	
}
else
	System.out.println("Arrays are not equal");
	}

}
