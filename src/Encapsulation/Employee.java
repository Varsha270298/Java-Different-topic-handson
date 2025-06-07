package Encapsulation;

public class Employee
{
private String ename="Karthik";//r
private int eid=12;//r/w
double salary=485.90;

public String getEname() {
	return ename;
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}


}
