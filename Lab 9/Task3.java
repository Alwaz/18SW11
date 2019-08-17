import java.util.*;
interface Calculator
{
	public long power(int n,int p); //abstract Method that needs to be implemented
}


class MyCalculator extends Exception implements Calculator
{
	public long power(int n,int p)
	{
		long r=1;
		for(int i=1;i<=p;i++)
		{
			r=r*n;
		}		//end of for loop
		return r;
	}
	
}

class MyCalculatorDisplay
{
	public static void main(String args[])
	{
		MyCalculator mc=new MyCalculator();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base= ");
		int n=sc.nextInt();
		System.out.print("Enter Power= ");
		int p=sc.nextInt();
		
		try
		{
			if(n<0 || p<0 || n==0 || p==0)
			{
				throw new Exception("Base or Power can not be 0 or -ve");
			}
			else
			{
				System.out.print("Result= "+mc.power(n,p));
			}
		}
		
		catch(Exception e)
		{
			System.out.print("Base or Power can not be 0 or -ve");
		}
		
	}
}


/*import java.util.Scanner;
 interface Calculator 
{
public long power(int n,int p) ;   //abstract method of the interface calculator that needs to be implemented
}
class MyCalculator extends Exception implements Calculator 
{
public long power(int n,int p) 
	{
		long result=1;
	for(int i=1;i<=p;i++)
		{
		result=result*n;
		}
		return result;
	}
}
class MyCalculatorDemo
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	MyCalculator c=new MyCalculator();
	try{
		System.out.print("enter 1st number= ");
		int n=sc.nextInt();
		System.out.print("enter 2nd number= ");
		int p=sc.nextInt();
		if(n<0 || p<0 || n==0 || p==0)
		{
			throw new Exception("THE N OR P CANT BE NEGATIVE or 0 ");
		}
		else
		System.out.println("the number is= "+c.power(n,p));
	}
		catch(Exception i)
		{
			System.out.println("THE N OR P CAN NEITHER BE NEGATIVE OR 0");
		}
	}
}*/
