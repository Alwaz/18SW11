class Display
{
	public static void main(String args[])
	{
	Student s1=new Student("Alwaz","18SW11",18);
	Marksheet m1=new Marksheet();
	m1.java=89;
	m1.OOP=78;
	m1.Calculus=90;
	Result r=new Result(s1,m1);
	r.creatStudentresult();
}
}