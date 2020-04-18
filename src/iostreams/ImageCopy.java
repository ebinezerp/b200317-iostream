package iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {

		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/Administrator/Pictures/Screenshots/Screenshot (142).png");

			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

			FileOutputStream fileOutputStream = new FileOutputStream("E:/iodemo/myimage.png");

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			/*
			 * // read() -> read a sigle byte int value = fileInputStream.read();
			 * System.out.println(value);
			 */

			byte[] array = new byte[bufferedInputStream.available()];

			// read(byte[] b) -> to read all the data and place in byte array
			bufferedInputStream.read(array);

			bufferedOutputStream.write(array);
			bufferedOutputStream.flush();
			bufferedInputStream.close();
			bufferedOutputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
