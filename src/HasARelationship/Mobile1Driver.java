package HasARelationship;

import java.util.Scanner;

public class Mobile1Driver {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		Mobile1 m= new 	Mobile1("Apple",23545.90);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice:\n 1:INSERTEARPHONE\n2:REMOVEEARPHONE\n");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
			System.out.println("Enter Brand");
			String brand =s.next();
			System.out.println("Enter Price");
			double price=s.nextDouble();
			System.out.println("Enter color");
			String color=s.next();
			m.insertEarphone(new Earphone(brand,price,color));
			
		}
			break;
			case 2:
			{
				m.removeEarphone();
				
			}
			break;
			case 3:
			{
				m.earphoneDetails();
			}
			break;
			case 4:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid option");
				
			}
			}
			
		}
		
		
	

	}

}
