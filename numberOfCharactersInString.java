package Array_problems;

import java.util.Arrays;

public class numberOfCharactersInString
{
    static int countofalpha=0;
	public static void main(String[] args)
	{
		String name="Heena";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<name.length();i++)
		{
		boolean answer=Character.isAlphabetic(c1[i]);
		if(answer==true)
		{
			countofalpha++;
		}
		
		}
		System.out.println(countofalpha);

	}

}
