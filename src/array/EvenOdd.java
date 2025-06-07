package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the number of  elements");
       int n=s.nextInt();//size of the array
       int a[]=new int[n];//declare an array
       System.out.println("Enter the elements");
       for(int i=0;i<n;i++)
       {
    	   a[i]=s.nextInt();
    	   
       }
       System.out.println("The Even number are");
       for(int i=0;i<n;i++)
       {
    	   if(a[i]%2==0)
    	   {
    		   System.out.println("even number "+a[i]);//print even number
    		   
    	   }
    	   else
    	   {
    		   System.out.println("odd number "+a[i]);
    	   }
       }
    	   
       
       
       
       
       
       
    	   
       
	}

}
