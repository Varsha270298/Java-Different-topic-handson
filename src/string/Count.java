package string;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the name");
      String name = s.next();
      int count = name.length();
      String name1=name.toUpperCase();
      String name2=name.toLowerCase();
      System.out.println("Name is lowercase "+name2);
      System.out.println("Name is uppercase " +name1);
      System.out.println("Number of letter are "+count);
      
      

	}

}





