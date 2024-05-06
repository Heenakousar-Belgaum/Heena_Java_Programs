package Array_problems;

public class studentnames {

	public static void main(String[] args) 
	{
		String names[]=new String[3]; //declare and initialization array
		names[0]="Jyothi";
		names[1]="Nitin";
		names[2]="Sheikh";
		
		String[] rollno=new String[3];
		rollno[0]="10";
		rollno[1]="11";
		rollno[2]="12";
		
		for(int i=0;i<=2;i++)
		{
			
			System.out.println(names[i].concat("         ").concat(rollno[i]));

		}
		
	}

}
