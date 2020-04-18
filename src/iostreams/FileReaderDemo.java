package iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {

			/*
			 * 1. File may existed FileReader class loads the file into memory 2. File may
			 * not be existed Throws the error - FileNotFoundException
			 * 
			 * 
			 * 
			 */

			FileReader fileReader = new FileReader("E:/iodemo/demo.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

//			char c = (char) fileReader.read();

			// return -1, if no characters are present to read

			/*
			 * int value;
			 * 
			 * while ((value = fileReader.read()) != -1) { System.out.print((char) value); }
			 */

			/*
			 * String line = bufferedReader.readLine();
			 * 
			 * System.out.println(line);
			 */

			String line;

			// readLine() -> returns null value if there are no line to read
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
