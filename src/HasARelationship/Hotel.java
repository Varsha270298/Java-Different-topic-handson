package HasARelationship;

public class Hotel 
{
 String hname;
 Swigy s;
Hotel(String hname) {

	this.hname = hname;
}
 public void connection (String cname,long cno)
 {
	s=new Swigy(cname,cno); 
 }
	
}
