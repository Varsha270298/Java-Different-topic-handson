package HasARelationship;

public class CarDriver {

	public static void main(String[] args)
	{
		Car c= new Car("Alto",3458.00,"red",new Engine(34.56));
		System.out.println(c.model);
		System.out.println(c.price);
		System.out.println(c.e.getCc());
		System.out.println(c.e.getEngine_no());
		c.e.getEngineDetails();
		c.getDetails();
	}

}
