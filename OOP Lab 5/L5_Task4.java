class Student
{
	String name,rollno;
	int age;
	public Student(String n,String rn,int a)
	{
		name=n;
		rollno=rn;
		age=a;
	}
	public void showData()
	{
		System.out.println("Name= " + name);
		System.out.println("Roll no= " + rollno);
		System.out.println("Age= " + age);
	}
} 