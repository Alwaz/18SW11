class Circle
{
	private double radius=1.0;
	private String color="Red";
	public Circle()
	{
		radius=0;
		color="null";
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public double getArea()
	{
		double Area=3.14*radius*radius;
		return Area;
	}
	public String toString()
	{
		return radius+" "+color;
	}
}


class Cylinder extends Circle
{
	private double height=1.0;
	public Cylinder()
	{
		this(1.0);
	}
	public Cylinder(double radius)
	{
		setRadius(radius);
	}
	public Cylinder(double radius,double height)
	{
		setRadius(radius);
		this.height=height;
		
	}
	public Cylinder(double radius,double height,String  color)
	{
		super(radius,color);
		this.height=height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double getVolume()
	{
		return super.getArea()*height;

	}
}


class Display
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.setRadius(2.45);
		c.setColor("Blue");
		System.out.println("Radius of Circle= "+c.getRadius());
		System.out.println("Color of Circle= "+c.getColor());
		System.out.println("Area of Circle="+c.getArea());
		Cylinder c1=new Cylinder();
		c1.setRadius(1.6);
		c1.setColor("Red");
		c1.setHeight(6.5);
		System.out.println(" ");
		System.out.println("Radius of Cylinder= "+c1.getRadius());
		System.out.println("Color of Cylinder= " +c1.getColor());
		System.out.println("Height of Cylinder= "+c1.getHeight());
		System.out.println("volume of Cylinder= "+c1.getVolume());
		
		
	}
}