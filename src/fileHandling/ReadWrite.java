package fileHandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWrite {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\VSUDAMBO");
		BufferedReader br = new BufferedReader(fr);
		FileOutputStream fos= new FileOutputStream("C:\\\\Users\\\\VSUDAMBO");
		PrintWriter pw = new PrintWriter(fos);
		String str =  br.readLine();
		while(str!=null)
		{
			pw.println(str);
			str=br.readLine();
			
		}
		System.out.println("written");
		pw.flush();
		

		
		
		

	}

}
