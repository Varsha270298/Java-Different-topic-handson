package IsArelationship;

public class Driver {

	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.i);
		a.m1();//print m1()
		//a.m2();//cant access child member with parent member
		
		B b= new B();
		System.out.println(b.a);
		b.m1();//can access parent class with child class reference
		b.m2();//print m2()
		System.out.println(b.i);
		
		
	}

}
