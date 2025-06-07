package HasARelationship;

public class MobileDriver {

	public static void main(String[] args)
	{
	  Mobile m= new Mobile("Apple",35000.00);
	  System.out.println(m.model);
	  m.insertSim(1234,"JIO");
	  m.getDetails();
	  System.out.println(m.s.getSimNo());
	  m.removeSim();//s=null
	  m.insertSim(23456, "AIRTEL");//s=new sim()
	  m.getDetails();
	  

	}

}
