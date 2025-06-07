package patternprogram;

import java.io.FileInputStream;

public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
       FileInputStream fin = new FileInputStream("D:\\testout.txt");
       
       int i = fin.read();
       
      /* int i=0;    
       while((i=fin.read())!=-1) */  
       System.out.println((char)i);
       fin.close();
       
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
  ggjhggf