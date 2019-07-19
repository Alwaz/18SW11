package Task3;
class SuperClass
{
	int x,y;
	
	final void Arth()
	{
		System.out.println("Using Final to Stop method OverRiddeing");  //this method cannot be overriden because its final,
	}
	
	
int sum(int x,int y)  
{
	x=x;
	y=y;
	int result=x+y;
	return result;
}	
}

class SubClass extends SuperClass
{
int a,b,c;
   int sum(int a,int b,int c) //method overriden
    {
		int r=a+b+c;
		return r;
    }	
}

class Display
{
	public static void main(String args[])
	{
		SuperClass s=new SuperClass();
		SubClass sc=new SubClass();
		s.Arth();
		System.out.println("Sum of 2 numbers " + s.sum(5,4));
		System.out.println("Sum of 3 numbers " + sc.sum(1,2,3));
		
		 
	}
}