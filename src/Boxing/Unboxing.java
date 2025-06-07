package Boxing;

public class Unboxing {

	public static void main(String[] args)
    {
     Long l = 20l;//object type
     long l1=l.longValue();//unboxing
      System.out.println(l1);
      
      Integer i =30;//object
      int i1=i.intValue();//unboxing convert object type into primitive datatype 
      System.out.println(i1);//unboxing
	}

}
