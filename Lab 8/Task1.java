package calculator;
import java.util.*;

interface AdvanceArthematic
   {
	public int sumOfFactors(int n);
   }


class MyCalculator implements AdvanceArthematic
{
	public int sumOfFactors(int n)
	    {   
		    int i;
		    int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter an Integer less than or equal to 1000: ");
			int x=sc.nextInt();
			if(x>1000)
			 {
				System.out.println("Out of limit");
			 }
			 
			 else if(x<=100)
			 {
			   System.out.println("Factors of "+x);
			    for(i=1;i<=x;++i)
			    {
				   if(x%i==0)
				    {
					System.out.println(" "+i);
					sum=sum+i;
				    }
			      }
			 }
			System.out.println("Sum of Factors: "+sum);
			 return sum; 
			}
}
class Display
{
	public static void main(String args[])
	{
		MyCalculator m=new MyCalculator();
		m.sumOfFactors(0);
	}
}