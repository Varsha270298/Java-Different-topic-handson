package HasARelationship;

public class Engine
{
  private int engine_no;//r
  private int cc;//r
public Engine(int engine_no, int cc) {
	super();
	this.engine_no = engine_no;
	this.cc = cc;
}
public Engine(double d) {
	//this.double=double;
}
public int getEngine_no() {
	return engine_no;
}
public void setEngine_no(int engine_no) {
	this.engine_no = engine_no;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
  public void getEngineDetails()
  {
	  System.out.println(engine_no);
	  System.out.println(cc);
  }
  

}
