package HasARelationship;

public class CollegeDriver {

	public static void main(String[] args)
	{
	College c = new College("ABC",12,new Student("karthik",12));
	System.out.println(c.cname);
	System.out.println(c.s.sname);
	c.s.display();
	c.getDetails();

	}

}
