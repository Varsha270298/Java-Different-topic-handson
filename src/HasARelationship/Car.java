package HasARelationship;

public class Car 
{
	String model;
	double price;
	String color;
	Engine e;
	//Engine e = new Engine(34,56);
	public Car(String model, double price, String color, Engine e) {
		
		this.model = model;
		this.price = price;
		this.color = color;
		this.e = e;
	}
	public void getDetails()
	{
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);
		System.out.println(e.getCc());
		System.out.println(e.getEngine_no());
	}

	
}
