
class L4_T6
{
	public static void main(String args[])
	{
        
		int a[]={4,5,6,7,8};
        int i;  
		int y=Integer.parseInt(args[0]);
        for(i=0;i<a.length;i++)
		{
			if(a[i]==y)
			{
			System.out.println("Element present at " +(i));
			break;
			}
		    
		}
		
		if(i==a.length)
		      {
			System.out.println("Value not found");
			  }		
	}
}
