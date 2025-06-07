package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadName {

	public static void main(String[] args) throws IOException
	{

	FileInputStream fin=new FileInputStream("C:\\programs\\example.txt");
	int ch = fin.read();
	while(ch!=-1)
	{
	System.out.println((char)ch);
	ch = fin.read();
	}
}

}
