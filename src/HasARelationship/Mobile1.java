package HasARelationship;

public class Mobile1 
{
	String brand;
	double price;
	Earphone e;
	public Mobile1(String brand, double price) {
	
		this.brand = brand;
		this.price = price;
	}
  public void insertEarphone(Earphone e)
  {
	  if (this.e==null)
	  {
		  this.e=e;
		  System.out.println("Earphone Inserted");
	  }
	  else
	  {
		  System.out.println("Earphone already inserted");
	  }
	  public void removeEarphone()
	  {
		  if(this.e==null)
		  {
			  System.out.println("Earphone not inserted");
		  }
		  else
		  {
			  this.e=null;
			  System.out.println("Earphone removed");
		  }
		  public void earphoneDetails()
		  {
			  if(this.e!=null)
			  {
				  System.out.println(e.brand);
				  System.out.println(e.price);
				  System.out.println(e.color);
				  
			  }
			  else
			  {
				  System.out.println("EarPhone not inserted");
			  }
		  }
	  }
  }
}
  


