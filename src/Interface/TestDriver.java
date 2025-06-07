package Interface;

public class TestDriver {

	public static void main(String[] args)
	{
	  //	Draw d= new Draw();//interface cannot instantiated
		Draw d = new Rectangle();
		d.draw();
		Draw d1 = new Circle ();
		d1.draw();
		
		

	}

}
