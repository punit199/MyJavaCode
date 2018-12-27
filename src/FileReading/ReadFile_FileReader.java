package FileReading;

import java.io.FileReader;

public class ReadFile_FileReader {

	public static void main(String[] args) throws Exception 
	  { 
	    // pass the path to the file as a parameter 
	    FileReader fr = new FileReader("C:\\\\Data\\\\FileRead.txt"); 
	  
	    int i; 
	    while ((i=fr.read()) != -1) 
	    System.out.print((char) i); 
	  } 
}
