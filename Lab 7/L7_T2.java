class Person
{
	private String name;
	private String address;
	
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		String Person=name+" "+address;
		return Person;
	}
}

class Student extends Person
{
	private String program;
 	private int year;
	private double fee;
	
	public Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	
	public void setProgram(String program)
	{
		this.program=program;
	}
	public String getProgram()
	{
		return program;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getyear()
	{
		return year;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public double getFee()
	{
		return fee;
	}
	public String toString()
	{
		String Student=super.toString()+" "+" "+program+" "+" "+year+" "+" "+fee;
		return Student;
	}
}


class Staff extends Person
{
	private String school;
	private double pay;
	
	public Staff(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	public void setPay(double pay)
	{
		this.pay=pay;
	}
	public double getPay()
	{
		return pay;
	}
	public String toString()
	{
		String Staff=super.toString()+" "+school+" "+pay;
		return Staff;
	}
}



class Show
{
	public static void main(String a[])
	{
		Person p=new Person("Alwaz"," Banglow#B13,Qasimabad");
		System.out.println("Name: "+p.getName());
		System.out.println("Person: "+p.toString());
		System.out.println(" ");
	
		Student s=new Student("Alwaz"," Banglow#B13,Qasimabad","18SW11",1,16000.0);
		System.out.println("Name: "+s.getName());
		System.out.println("Program: "+s.getProgram());
		System.out.println("Year: "+s.getyear());
		System.out.println("Fee: "+s.getFee());
		System.out.println("Student: "+s.toString());
		System.out.println(" ");
		
		Staff st=new Staff("Farhan"," Banglow#B13,Qasimabad","MUET",80000);
		System.out.println("Name: "+st.getName());
		System.out.println("School: "+st.getSchool());
		System.out.println("Pay: "+st.getPay());
		System.out.println("Staff: "+st.toString());
		
	}
}
