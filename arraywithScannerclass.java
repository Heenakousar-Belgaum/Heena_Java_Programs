package Array_problems;

import java.util.Scanner;

public class arraywithScannerclass {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int rollno[]=new int[3];
		
		rollno[0]=s.nextInt();
		rollno[1]=s.nextInt();
		rollno[2]=s.nextInt();
		
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
	}

}
