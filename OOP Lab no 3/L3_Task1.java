import java.util.*;
class L3_Task1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Obtsined marks=");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println("C++= " + num1);
		System.out.println("Data Structures= " + num2);
		System.out.println("Operating System= " +  num3);
		
		double ObtTotal=num1+num2+num3;
		float percentage,Total=300;
		percentage=(float)((ObtTotal*100)/Total);
		
		System.out.println("Total marks Obtained = " + ObtTotal);
		System.out.println("Percentage= " + percentage + "%" );
		
		if(percentage>90)
		{
			System.out.println("Grade: 'A'");
		}
		else if(percentage<90 && percentage>=80)
		{
			System.out.println("Grade: 'B'");
		}
		else if(percentage<80 && percentage>=70)
		{
			System.out.println("Grade : 'C'");
		}
		else if(percentage<70 && percentage>=60)
		{
			System.out.println("Grade : 'D'");
		}
		else
		{
			System.out.println("'FAIL'");
		}
		
	}
	
}