package File_ReadAndWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class RW_File {
	
	public static void main(String[] args)throws Exception 
	  { 

	File file = new File("C:\\Data\\FileRead.txt"); 
	  
	  //Using BufferReader class ,trying to read a file 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  String st; 
	  while ((st = br.readLine()) != null) 
	  System.out.println(st); 
	  
	  
	  
	  
	  Writer writer = null;

	  try {
	      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Data\\FileWrite.txt"), "utf-8"));
	      writer.write(st);
	  } catch (IOException ex) {
	      // Report
	  } finally {
	     try {
	    	 writer.close();
	    	 } 
	     catch (Exception ex)
	     {
	    	 /*ignore*/
	    	 
	     }
	  }
	  } 

}
