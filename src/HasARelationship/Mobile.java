package HasARelationship;

public class Mobile 
{
 String model;
 double price;
 Sim s;
public Mobile(String model, double price) {
	
	this.model = model;
	this.price = price;
}
 public void insertSim(int sim_no,String service_provider)
 {
	s= new Sim(sim_no,service_provider); 
 }
 public void getDetails()
 {
	 System.out.println(model);
	 System.out.println(price);
	 System.out.println(s.getSimNo());
	 System.out.println(s.service_provider);
 }
 public void removeSim()
 {
	 s=null;
	 System.out.println("Sim Removed");
 }
}
