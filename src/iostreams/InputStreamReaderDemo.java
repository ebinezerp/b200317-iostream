package iostreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {

		// (InputStream is) - parameter
		InputStreamReader isr = new InputStreamReader(System.in);
		//(Reader r) - AC
		BufferedReader br = new BufferedReader(isr);

		try {

			/*
			 * // read a single character and return unicode of that character // A - 65 int
			 * value = isr.read(); System.out.println((char)value);
			 */

			/*
			 * char c;
			 * 
			 * while ((c = ((char) isr.read())) != '#') { System.out.print(c); }
			 */
			
			
			// - we must know how many character we are going to read
			/*
			 * char[] array = new char[size]
			 * */
			
			/*
			 * char[] array = new char[10]; isr.read(array);
			 * 
			 * for(char c:array) { System.out.print(c); }
			 */
			
			
			/*
			 * char[] array = new char[20]; isr.read(array, 4, 6);
			 * 
			 * for(char c: array) { System.out.print(c); }
			 */
			
			
			
			String line = br.readLine();
			System.out.println(line);
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
