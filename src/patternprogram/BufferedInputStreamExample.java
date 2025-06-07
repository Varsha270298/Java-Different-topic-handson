package patternprogram;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin= new FileInputStream("D:\\testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1) {
				System.out.println((char)i);
			}
			bin.close();
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
				
				
			}
			
		}
	}


