class Rectangle
{
	void area(double side)
    {
        System.out.println("Area of  square= "+Math.pow(side, 2)+" sq units");
    }
	
		
	void area(double length, double breadth)
	{
		System.out.println("Area of Rectangle= " +length*breadth+ " sq/units");
		
	}
}

	
class UseRectangle
{
	public static void main(String args[])
	{
	   Rectangle r=new Rectangle();
	   r.area(5);
	   r.area(5.6,4.5);
    }
}