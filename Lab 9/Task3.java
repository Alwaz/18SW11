import java.util.*;
interface Calculator
{
	public long power(int n,int p); //abstract Method that needs to be implemented
}


class MyCalculator extends Exception implements Calculator
{
	public long power(int n,int p)  //implementing abstract method
	{
		
		long r=1;
		for(int i=1;i<=p;i++)
		{
			r=r*n;
		}		//end of for loop
		
		return r;
	}  //end of implemented abstract method
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


