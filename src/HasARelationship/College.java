package HasARelationship;

public class College
{
  String cname;
  int cid;
  Student s;
public College(String cname, int cid, Student s) {
	super();
	this.cname = cname;
	this.cid = cid;
	this.s = s;
}
  public void getDetails()
  {
	  System.out.println(cname);
	  System.out.println(cid);
	  System.out.println(s.sname);
	  System.out.println(s.sid);
  }
}
