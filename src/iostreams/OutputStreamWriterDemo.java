package iostreams;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
	
	public static void main(String[] args) {
		//OutputStreamWriter(OutputStream out)
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		
		BufferedWriter bufferedWriter = new BufferedWriter(osw);
		
		
		
		
		/*
		 * int x = 100;
		 * 
		 * try { // write data into stream osw.write(x);
		 * 
		 * // push data to destination osw.flush(); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		
		
		try {
			bufferedWriter.write("ravi");
			bufferedWriter.newLine();
			bufferedWriter.write("kishore");
			bufferedWriter.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
