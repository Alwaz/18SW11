package Game;
class Sports
{
	String getName()
	{
		return "Genetic Sports";
	}
	
	void getNumberOfTeamMembers()
	{
		System.out.println("Each Team has n players in= " +getName());
	}
}


class Cricket extends Sports
{
	String getName()
	{
		return "Circket";
	}
	int getNumberOfTeamMembers(int x)
	{
		System.out.println("Each Team has "+x+" players in= " +getName());
		return x;
	}
}

class Soccer extends Sports
{
	String getName()
	{
		return "Soccer";
	}
	
	int getNumberOfTeamMembers(int n)
	{
		System.out.println("Each Team has "+n+" players in= " +getName());
		return n;
	}
}

class Display
{
	public static void main(String args[])
	{
		Sports s=new Sports();
		Cricket c=new Cricket();
		Soccer so=new Soccer();
		s.getName();
		s.getNumberOfTeamMembers();
		System.out.println(" ");
		System.out.println(""+c.getName());
		System.out.println(""+c.getNumberOfTeamMembers(11));
		System.out.println(" ");
		System.out.println(""+so.getName());
		System.out.println(""+so.getNumberOfTeamMembers(11));
		
}
}