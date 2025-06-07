package Throw;

import java.util.Scanner;

public class ThrowDemo2 {
	public static void validate (int age)
	{
		if(age<18)
		{
			System .out.println("Person not eligible to vote");
			
		}
		else {
			System.out.println("Person eligible to vote");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		validate(age);
		
		

	}

}
