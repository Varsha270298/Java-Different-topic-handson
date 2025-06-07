package string;

public class Demo {

	public static void main(String[] args) {
		String s1= "Good Morning";
		String s2 = "Good Morning";
		String s3 = new String ("Good Morning");
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s1.equals(s2));//true
		
		
	}

}
