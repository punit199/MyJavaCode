package FileWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile_BufferWriter {

	 public static void main(String[] args) throws IOException {
	        String text = "TestYantra";
	        BufferedWriter output = null;
	        try {
	            File file = new File("C:\\Data\\FileWrite.txt");
	            output = new BufferedWriter(new FileWriter(file));
	            output.write(text);
	        } 
	        catch ( IOException e ) {
	            e.printStackTrace();
	        } 
	        finally {
	          if ( output != null ) {
	            output.close();
	          }
	        }
	    }
}
