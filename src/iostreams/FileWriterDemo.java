package iostreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		
		
		try {
			
			/*
			 *  1. File may existed
			 *       FileWriter class rewrites the file or appends the data to the file
			 *  2. File may not be existed
			 *  	 FileWriter class creates the file, but not directories
			 *  
			 *  Read, Write, append
			 *  
			 *  
			 *  write:
			 *  
			 *  demo.txt 
			 *     run -1 
			 *        ebinezer
			 *     run -2
			 *        perumala
			 *        
			 *        data -> demo.txt is perumala
			 *        
			 *        
			 *  append
			 *    
			 *  demo.txt
			 *      run -1
			 *         ebinezer
			 *      run -2
			 *         perumala
			 *         
			 *         data -> demo.txt is ebinezerperumala
			 *     
			 * 
			 * */
			
			
			FileWriter fileWriter = new FileWriter("E:/iodemo/demo.txt", true);
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(" kumar");
			bufferedWriter.flush();
			bufferedWriter.close();
			
			System.out.println("successfully executed");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
