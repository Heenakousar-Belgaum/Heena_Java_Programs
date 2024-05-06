package Array_problems;

public class studentnameRollnoGender {

	public static void main(String[] args) 
	{

	String names[]=new String[3]; //declare and initialization array
	names[0]="Jyothi";
	names[1]="Nitin";
	names[2]="Sheikh";
	
	int rollno[]=new int[3];
	rollno[0]=10;
	rollno[1]=11;
	rollno[2]=12;
	
	char gender[]=new char[3];
	gender[0]='F';
	gender[1]='F';
	gender[2]='M';
	
	for(int i=0;i<=2;i++)
	{
		
		System.out.println(names[i]+"       "+(rollno[i])+"     "+(gender[i]));

	}
	
	}
}
