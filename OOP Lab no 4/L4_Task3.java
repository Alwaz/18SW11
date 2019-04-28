import java.util.*;
class L4_T3
{
	public static void main(String args[])
	{
		int x,i;
		i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount of Numbers to be sumed= ");
		x=sc.nextInt();
		int sum=0;
		int a[]=new int[x];
		System.out.println("Enter " +x+ " Numbers");
		while(i<x)
		{
			System.out.print("Enter number= " );
			a[i]=sc.nextInt();
			sum+=a[i];
			i++;
		}
		System.out.print("Sum is =" +sum);
		
		 
}
}