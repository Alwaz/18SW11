import java.util.*;
class L3_Task4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("First number = ");
		int x=sc.nextInt();
		System.out.println("Second number = ");
		int y=sc.nextInt();
		System.out.println("Opearator = ");
		char o=sc.next().charAt(0);
		int z;
		if(o=='+')
		{
			z=x+y;
			System.out.println("Sum = "+ z);
		}
		else if(o=='-')
		{
			z=x-y;
			System.out.println("Subtraction = " + z);
		}
		else if(o=='*')
		{
			z=x*y;
			System.out.println("Product = "+ z);
		}
		else if(o=='/')
		{
			z=x/y;
			System.out.println("Division = " +z);
		}
		else
			System.out.println("Invalid Operator.");
		
		
	}		
}	