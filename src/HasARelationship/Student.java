package HasARelationship;

public class Student 
{
   String sname;
   int sid;
public Student(String sname, int sid) {
	
	this.sname = sname;
	this.sid = sid;
}
   public void display()
   {
	   System.out.println(sname);
	   System.out.println(sid);
   }
}
