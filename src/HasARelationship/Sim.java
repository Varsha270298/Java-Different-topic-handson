package HasARelationship;

public class Sim 
{
 private int sim_no;
 String service_provider;
public Sim(int sim_no, String service_provider) {

	this.sim_no = sim_no;
	this.service_provider = service_provider;
}
 public int getSimNo()
 {
	 return sim_no;
 }
	public void getSimDetails()
	{
		System.out.println(sim_no);
		System.out.println(service_provider);
		
	}

}
