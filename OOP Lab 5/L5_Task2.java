import java.util.*;
class Myclass
{
	int a[]=new int[5];
	int i;
	Scanner sc=new Scanner(System.in);
	public void populateArray()
	{
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt(); 
			
		}
	}
	public void showArray()
	{
		System.out.print("Even Numbers : ");
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
		      {		
				System.out.println(a[i]);	
		      }	
		}
		System.out.print("Odd Numbers : ");
		for(i=0;i<5;i++)
		{
			if(a[i]%2!=0)
		      {		
				System.out.println(a[i]);	
		      }	
		}
		
		
	}
}
