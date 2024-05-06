package Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Check2ArraysAreEqual {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[3];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the Array -->"+i);
			rollno[i]=s1.nextInt();
			
		}
		int rollno1[]=new int[3];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter the Array"+i);
			rollno1[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		if(Arrays.equals(rollno, rollno1))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

}
