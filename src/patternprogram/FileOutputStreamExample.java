package patternprogram;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
    	  String s ="Welcome to javatpoint";
    	  //convert string into byte array
    	  byte b[] = s.getBytes();
    	  fout.write(b);
    	  fout.close();
    	  System.out.println("success");
      }
    	  catch(Exception e) {
    		  System.out.println(e);
    		  
    	  }
    	  
      }
	}


 
