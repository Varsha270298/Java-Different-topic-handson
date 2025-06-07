package patternprogram;

public class LeftTringle {

	public static void main(String[] args) {
		
		 int i,j,row =6;
		 //outer loop for rows
		 for(i=0;i<row;i++)
		 {
			 //inner loop for space
			for(j=2*(row-i);j>=0;j--) 
			{ 
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
