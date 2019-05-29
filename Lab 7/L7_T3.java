class Shape
{
	private String color="red";
	private boolean filled=true;
	
	public Shape()
	{
		color="null";
		filled=false;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public String toString()
	{
		String s=color+" "+filled;
		return s;
	}
}

class Circle extends Shape
{
	private double radius=1.0;
	
	public Circle()
	{
		radius=0;
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double Radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		double area=3.14*radius*radius;
		return area;
	}
	public double getPerimater()
	{ 
	    double perimeter=2*3.14*radius;
		return perimeter;
	}
	public String toString()
	{
		String s1="Radius: "+radius+" Area: "+this.getArea()+" Perimeter: "+this.getPerimater();
		return s1;
	}	
}

class Rectangle extends Shape
{
	private double width=1.0;
	private double length=1.0;
	
	public Rectangle()
	{
		this.width=0;
		this.length=0;
	}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getWidth()
	{
		return width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getLength()
	{
		return length;
	}
	public double getArea()
	{
		double area=width*length;
		return area;
	}
	public double getPerimater()
	{
		double perimeter=2*(length+width);
		return perimeter;
	}
	public String toString()
	{
		String s2="Length: "+length+" Width: "+width+" Color: "+super.toString()+" Area: "+this.getArea()+" Parameter: "+this.getPerimater();
		return s2;
	}
}

class Square extends Rectangle
{
	private double side;
	public Square()
	{
		side=0;
	}
	public Square(double side)
	{
		this.side=side;
	}
	public Square(String color,boolean filled,double side)
	{
		this.side=side;
		
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setWidth(double side)
	{
		this.side=side;
	}
	public void setLength(double side)
	{ 
	   this.side=side;
	}
	public String toString()
	{
		String s3=side+" "+super.toString();
		return s3;
	}
}


class Display
{
	public static void main(String a[])
	{
		Shape s=new Shape("Red",true);
		s.setColor("No Color");
		System.out.println("Color:" +s.getColor());
		s.setFilled(false);
		System.out.println("filled: " +s);
		System.out.println(" ");
		
		System.out.println("Shape: Circle" );
		Circle c=new Circle(4);
		c.setColor("Red");
		c.setRadius(4.5);
		System.out.println("Color: " +c.getColor());
		System.out.println("Radius of Circle: " +c.getRadius());
		System.out.println("Area of Circle: " +c.getArea());
		System.out.println("Perimeter of Circle: "+c.getPerimater());
		System.out.println(c.toString());
		System.out.println(" ");
		
		System.out.println("Shape: Rectangle." );
		Rectangle r=new Rectangle();
		r.setColor("Blue");
		System.out.println("Color:" +r.getColor());
		r.setWidth(3.0);
		System.out.println("Width of Rectangle: "+r.getWidth());
		r.setLength(4.5);
		System.out.println("Length of Rectangle: "+r.getLength());
		System.out.println("Area of Rectangle: "+r.getArea());
		System.out.println("Parameter of Rectangle: "+r.getPerimater());
		System.out.println(" ");
		
		System.out.println("");
		System.out.println("Shape: Square");
		Square p=new Square();
		p.setColor("Grey");
		System.out.println("Color: " +p.getColor());
		p.setSide(5.6);
		System.out.println("Lenghth of side a:  "+p.getSide());
       		
	}
}
