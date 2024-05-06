package Array_problems;

import java.util.Scanner;

public class arraywithscannerclassNames {

	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		String names[]=new String[3];
		
		names[0]=s2.next();
		names[1]=s2.next();
		names[2]=s2.next();
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(names[i]);
		}
		
	
	}
}