package patternprogram;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Welcome to java";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			
			System.out.println("success");
}catch(Exception e) {
	System.out.println(e);
}
			
		}
	}


