class Student
{
	String name,rollno;
	int age;
	Student(String n,String r,int a)
	{
		name=n;
		rollno=r;
		age=a;
	}
}
class Marksheet
{
	int java,OOP,Calculus,result;
	double per;
	
}
class Result
{
	Student s;
	Marksheet m;
	Result(Student s1, Marksheet m1)
	{
		s=s1;
		m=m1;
		
	}
	void creatStudentresult()
	{
		System.out.println("Name= " +s.name);
		System.out.println("Roll no=" +s.rollno);
		System.out.println("Age=" +s.age);
		m.result=m.java+m.OOP+m.Calculus;
		System.out.println("Resul= " + m.result);
		m.per=m.result*100/300;
		System.out.println("Percentage=" +m.per);
		if(m.per>90)
		{
			System.out.println("Grade= 'A+'");
		}
		else if(m.per<90 && m.per>=80)
		{
			System.out.println("Grade= 'A'");
		}
		else if(m.per<80 && m.per>=70)
		{
			System.out.println("Grade= 'B'");
		}
		else if(m.per<70 && m.per>=60)
		{
			System.out.println("Grade= 'C'");
		}
		else if(m.per<60)
		{
			System.out.println("FAIL");
		}
	}
}