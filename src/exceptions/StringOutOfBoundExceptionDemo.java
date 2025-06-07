package exceptions;

public class StringOutOfBoundExceptionDemo {

	public static void main(String[] args) {
	String name = "Karthik";
	try
	{
		char ch = name.charAt(7);
		System.out.println(ch);
	}	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("No index 7 present");
	}
	}

}
