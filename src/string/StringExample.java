package string;

public class StringExample {

	public static void main(String[] args) {
		
       StringBuffer s= new StringBuffer("Good Morning");
       s.append("guys");
       s.delete(1, 3);
       System.out.println(s);
	}

}
