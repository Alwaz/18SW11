class StaticDemo
{
	static String name;      //static variables
	static String rollno;
	static int age;
	
	static              //Static block to initiallize static variables
	{
		name="Alwaz";
		rollno="18SW11";
		age=18;
	}
	
	static void getInfo()              //Static Method
	{
		System.out.println("Name= " + name);
		System.out.println("Rollno= " + rollno);
		System.out.println("Age= " + age);
	}
	
}

class UseStatic
{
	public static void main(String args[])
	{
		StaticDemo.getInfo();     //it is called without creating obj
	}
}
