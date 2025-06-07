package exceptions;

public class ArithmeticExceptionDemo {

	public static void main(String[] args)
	{
	int a= 10;
	int b= 0;
	try
	{
		int c=a/b;//Arithmetic Exception
		System.out.println(c);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot divide by zero");
		
	}
	System.out.println("hi good morning");
	System.out.println("Good Morning");
	}

}
