class Task3
{
	int x;
	char a;
	public void myMethod(int y,char b)
	{
		x=y;
		a=b;
		System.out.println("Number is= " +y);
		System.out.println("Character is= " + b);
		
	}
	public void myMethod(char d,int z )
	{
		a=d;
		x=z;
		System.out.println("Character is= " + d);
		System.out.println("Number is= " +z);
	}
	
	public static void main(String args[])
	{
		Task3 t=new Task3();
		t.myMethod(3,'A');
		t.myMethod('B',5);
		
	}
}
