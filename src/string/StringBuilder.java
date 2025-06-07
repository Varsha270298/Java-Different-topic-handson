package string;

public class StringBuilder {

	public static void main(String[] args) {
		String s1="James";
		StringBuilder S2= new StringBuilder("James");
		StringBuffer s3= new StringBuffer("James");
		System.out.println(s1.toStringBuilder()==s3);
		System.out.println(s2==s3.toStringBuilder());
		
		

	}

}
