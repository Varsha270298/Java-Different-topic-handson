package Encapsulation;

public class StudentDriver {

	public static void main(String[] args) 
	{
      Student s= new Student();
      System.out.println(s.getName());
      System.out.println(s.getAge());
      s.setAge(25);
      System.out.println(s.getCno());
      s.setCno(123456);
	}

}
