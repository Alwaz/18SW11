class Person
{
	String name;
	public Person(String name)
	{
		this.name=name;
	}
	public void Display()

	{
		System.out.println("Name= " +name);
	}
	
}
class Student extends Person
{
	public Student()
	{
	super("Alwaz");
	}
	String rollno,nameofcol;
	public void setDisplay(String nameofcol,String rollno)
	 {
		 System.out.println("Rollno= "+rollno);
		 System.out.println("Name of Institude= "+nameofcol);
		 System.out.println(" ");
		 
	 }
} 
class Employee extends Person
{
	public Employee()
	{
		super("Alwaz"); 
	}
	int eno;
	double sallary;
	public void setInfo(int eno,double sallary)
	{
		System.out.println("Employee number= " +eno);
		System.out.println("Sallary= "+sallary);
	}
	
}
class Undergraduate extends Student
{
	public Undergraduate()
	{
	System.out.println("Program= Undergraduate ");
	}
}
class Graduate extends Student
{
	public Graduate()
	{
		System.out.println("Program= Graduate ");
	}
}
class Faculty extends Employee
{
	public Faculty()
	{
		System.out.println("Position=Faculty ");
	}
	
}
class Staff extends Employee
{
	public Staff()
	{
		System.out.println("Position=Staff");
	}
}
class Master extends Graduate
{
	public Master()
	{
		System.out.println("Degree= Master");
	}
}
class Doctoral extends Graduate
{
	public Doctoral()
	{
		System.out.println("Degree= Doctoral");
	}
}
class NonDegree extends Graduate
{
	public NonDegree()
	{
		System.out.println("Degree= NonDegree");
	}
}







class MainClass
{
	public static void main(String args[])
	{
		Student s=new Student();
		Employee e=new Employee();
		System.out.println("Student Information: ");
		System.out.println(" ");
		s.Display();
		s.setDisplay("MUET","18SW11");
		System.out.println("Employee's Information: ");
		System.out.println(" ");
		e.Display();
		e.setInfo(11,45000.0);
		System.out.println(" ");
		System.out.println("Undergraduate Program: ");
		System.out.println(" ");
		Undergraduate u=new Undergraduate();
		s.Display();
		u.setDisplay("MUET","18SW11");
		System.out.println(" ");
		System.out.println("Graduate Progam: ");
		Graduate g=new Graduate();
		s.Display();
		g.setDisplay("MUET","18SW11");
		System.out.println(" ");
		System.out.println("Employee's Position ");
		Faculty f=new Faculty();
		s.Display();
		f.setInfo(75,45000.0);
		System.out.println(" ");
		System.out.println("Employee's Position ");
		Staff s1=new Staff();
		s1.Display();
		f.setInfo(108,35000.59);
		System.out.println(" ");
		s.Display();
		Master m=new Master();
		System.out.println(" ");
		Doctoral d=new Doctoral();
		System.out.println(" ");
		NonDegree n=new NonDegree();
		
		
		
		
		
		
		
		
		
	}
}
	 