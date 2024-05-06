package Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysareEqual_boolean {

	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		boolean b[]=new boolean[2];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("boolean is"+i);
			b[i]=s2.nextBoolean();
		}
		System.out.println(Arrays.toString(b));
		boolean b1[]=new boolean[2];
		for(int i=0;i<b1.length;i++)
		{
			System.out.println("boolean is"+i);
			b1[i]=s2.nextBoolean();
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(b1));
		
		if((Arrays.equals(b, b1)))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
