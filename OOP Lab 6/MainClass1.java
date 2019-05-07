class MainClass
{
	public static void main(String args[])
	{
		Author a=new Author("Tan AhTeck "," (ahtech@somewhere.com) ",'m');
	    System.out.println("Name= " +a.getName());
		System.out.println("Email= " +a.setEmail("ahtech@somewhere.com"));
		System.out.println("Gender= " +a.getGender());
		System.out.println(" ");
		System.out.println("Author's Information= "+a.toString());
	}
}