import java.util.*;
class L4_T5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Elements of Array= ");
		int x=sc.nextInt();
		int a[]=new int[x];
		System.out.print("Enter Elements in Array= ");
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		int y = a[0];
        for(int i = 0; i < x; i++)
        {
            if(y < a[i])
            {
                y = a[i];
            }
        }
        System.out.println("Maximum value:"+y);
    }
	}
