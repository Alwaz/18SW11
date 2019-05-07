class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender )
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String setEmail(String email)
	{
		return this.email=email;
	}
	public char getGender()
	{
		return this.gender;
	}
	public String toString()
	{
		String s1=this.name+" "+this.email+" "+this.gender;
		return s1;
	}
}
