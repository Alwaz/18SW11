class CountDemo
{
	static int count=0;
      CountDemo()
	  {
		  count++;
		  System.out.println(count);
	  }
	public static void main(String args[])
	{
		CountDemo c1=new CountDemo();
		CountDemo c2=new CountDemo();
		CountDemo c3=new CountDemo();
		CountDemo c4=new CountDemo();
	}
		
	
	
} 