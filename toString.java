package Array_problems;


import java.util.Arrays;
import java.util.Scanner;

public class toString {

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		String names[]=new String[3];
		
		for(int i=0;i<names.length;i++)
		{    
			names[i]=s1.next();			
			System.out.println(i);
		}
		
		
		System.out.println(Arrays.toString(names));

	}

}
