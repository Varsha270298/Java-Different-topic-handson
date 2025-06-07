package exceptions;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
	String name = null;
	try
	{
		System.out.println(name.equals("karthik"));//NullPointerException
		
	}
	catch(NullPointerException e)//throwbale type object reference
	{
		System.out.println("cannot comapre with null");
	}
	}

}
