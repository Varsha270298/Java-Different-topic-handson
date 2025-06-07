package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteName {

	public static void main(String[] args) throws FileNotFoundException 
	{
FileOutputStream fos= new FileOutputStream("C:\\programs\\example.txt");
PrintWriter pw = new PrintWriter(fos);
pw.println("A stream is a sequense of data .In java ,a stream is "+"composed of byte.");
pw.flush();
System.out.println("Data written on file");

	}

}
