class Marksheet
{
	int java,OOP,Calculus,total;
	double per;
	public void Total(int j,int o,int c)
	{
		java=j;
		OOP=o;
	    Calculus=c;
		total=j+o+c;
		System.out.print("Total Marks= " + total);
	}
	public void Percentage()
	{
		per=total*100/300;
		System.out.println("Percentage= " + per);
	}
	public void Grade()
	{
		if(per>90)
		{
			System.out.println("Grade= A");
		}
		else if(per>=80 && per<=90)
		{
			System.out.println("Grade= B");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("Grade= C");
		}
		else if(per<60)
		{
			System.out.println("FAIL");
		}
	}
}


