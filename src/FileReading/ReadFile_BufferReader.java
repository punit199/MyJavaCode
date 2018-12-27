package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile_BufferReader {

	public static void main(String[] args)throws Exception 
	  { 
	   
	  File file = new File("C:\\Data\\FileRead.txt"); 
	  
	  //Using BufferReader class ,trying to read a file 
	  
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  String st; 
	  while ((st = br.readLine()) != null) 
	  System.out.println(st); 
	  } 
}
