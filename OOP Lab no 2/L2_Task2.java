class L2_Task2
{
	public static void main(String args[])
	{
		boolean x=true;
		boolean y=false;
	
		boolean c=x|y;
		boolean d=x&y;
		boolean e=!y;
        boolean f=y^x;		//boolean logical operators
		
		boolean a=5<7; // relational operators
		boolean b=4>=3;
		boolean p=6==6;
		boolean q=4<5; 
        System.out.println("LOGICAL BOOLEAN OPERATORS:" );
		System.out.println("x= " +x );
		System.out.println("y= " +y );
		System.out.println("x|y= " +c );
		System.out.println("x&y " +d );
		System.out.println("!y " +e );
		System.out.println("z^x = " +f );
		
		System.out.println(" " );
		System.out.println("RELATIONAL OPERATORS:");
		System.out.println("5<7= " +a );
		System.out.println("4>=3= " +b );
		System.out.println("6==6= " +p );
		System.out.println("4<5= "  +q );
	}
}