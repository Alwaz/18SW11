import java.util.*;
class L3_Task2
{
	public static void main(String args [])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units= " );
		x=sc.nextInt();
		if(x==50)
		{
			System.out.println("Price=10  ");
		}
		else if(x>50 && x<=100)
		{
			System.out.println("Price=15");
		}
		else if(x>100 && x<=200)
		{
			System.out.println("Price=20");
		}
		else if(x>200 && x<=300)
		{
			System.out.println("Price=25");
		}
		else if(x>300)
		{
			System.out.println("Price=30");
		}
	}
}	