package string;

public class Demo1 {

	public static void main(String[] args) {
      StringBuffer s1= new StringBuffer("Hello");
      StringBuffer s2 = new StringBuffer("Hello");
      System.out.println(s1==s2);//false
      System.out.println(s1.equals(s2));//false
      
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s1);//Hello
      System.out.println(s2);//Hello
      

	}

}
