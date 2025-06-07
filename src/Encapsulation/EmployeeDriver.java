package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args)
	{
      Employee e= new Employee();
      System.out.println(e.getEname());//karthik
      System.out.println(e.getEid());//12
      System.out.println(e.salary);//485.90
      e.setEid(35);
      System.out.println(e.getEid());//35
      e.salary=567.90;
      System.out.println(e.salary);//567.90

	}

}
