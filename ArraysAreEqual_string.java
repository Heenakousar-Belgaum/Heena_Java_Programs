package Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAreEqual_string {

	public static void main(String[] args)
	{
		Scanner s3=new Scanner(System.in);
		String names[]=new String[3];
		for(int i=0;i<names.length;i++)
		{
			System.out.println("name is "+i);
			names[i]=s3.next();
			
		}
     System.out.println(Arrays.toString(names));
     
     String names1[]=new String[3];
     for(int i=0;i<names.length;i++)
     {
    	 System.out.println("name is "+i);
    	 names1[i]=s3.next();
     }
     System.out.println(Arrays.toString(names1));
     
     if((Arrays.equals(names,names1))==true)
     {
    	 System.out.println("Names are equal");
    	 
     }
     else
     {
    	 System.out.println("Names are not equal");
     }
	}

}
