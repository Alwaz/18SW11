import java.util.*;
class L4_T2
{
	public static void main(String args[])
	{
		int x,y,z,result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Which Table?");
		x=sc.nextInt();
		System.out.print("Enter Start of Table= ");
		y=sc.nextInt();
		System.out.print("Enter End of Table= ");
		z=sc.nextInt();
		for(int i=y;i<=z;i++)
		{
			result=x*i;
			System.out.println(+x+"*"+i+"="+result);
		}
		
	}
}