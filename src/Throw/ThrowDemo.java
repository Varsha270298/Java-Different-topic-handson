package Throw;

public class ThrowDemo 
{
  public static void m1() throws ArithmeticException
  {
	  int a= 10;
	  int b= 0;
	  int c= a/b;
	  System.out.println(c);
	  
  }

	public static void main(String[] args)
	{
		try {
			m1();
			
		}
 catch(Exception e)
		{
	 System.out.println("Exception handled");
	 
		}

	}

}
