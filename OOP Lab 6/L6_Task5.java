class Student
{
	String name;
	int age;
	String address;
	
	Student()
	{
		name="Unknown";
		age=0;
		address="not available";
	}
	
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void Display()
	{
		System.out.println("Name= " +name);
		System.out.println("Age= " +age);
		System.out.println("Address= " +address);
		System.out.println(" ");
	}
}

class UseStudent
{
public static void main(String args[])
{
	Student s[]=new Student[10];
    Student s1=new Student();
	s1.setInfo("Alwaz",19);
	s[0]=s1;
	Student s2=new Student();
	s2.setInfo("Fatima",18,"Hyderabad");
	s[1]=s2;
	Student s3=new Student();
	s3.setInfo("Unsa",20,"Qasimabad");
	s[2]=s3;
	Student s4=new Student();
	s4.setInfo("Sameera",19,"Latifabad");
	s[3]=s4;
	Student s5=new Student();
	s5.setInfo("Aliza",18);
	s[4]=s5;
	Student s6=new Student();
	s6.setInfo("Rohat",17,"Hyderabad");
	s[5]=s6;
	Student s7=new Student();
	s7.setInfo("Hadi",17);
	s[6]=s7;
	Student s8=new Student();
	s8.setInfo("Muntaha",20);
	s[7]=s8;
	Student s9=new Student();
	s9.setInfo("Taha",18,"Dubai");
	s[8]=s9;
	Student s10=new Student();
	s10.setInfo("Mujtaba",18,"Dadu");
	s[9]=s10;
	for(int i=0;i<s.length;i++)
	{
		s[i].Display();
	}
	
	
	
	

}
}	