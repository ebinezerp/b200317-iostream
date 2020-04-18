package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	private String source;
	private String destination;

	public FileCopy(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public void copy() {

		/*
		 * BufferedWriter bufferedWriter = null; BufferedReader bufferedReader = null;
		 * 
		 * try { bufferedWriter = new BufferedWriter(new FileWriter(destination));
		 * 
		 * // exception - occuring bufferedReader = new BufferedReader(new
		 * FileReader(source));
		 * 
		 * String line;
		 * 
		 * while ((line = bufferedReader.readLine()) != null) {
		 * bufferedWriter.write(line); bufferedWriter.newLine(); bufferedWriter.flush();
		 * }
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); } finally { try { bufferedWriter.close();
		 * bufferedReader.close(); } catch (IOException | NullPointerException e) {
		 * e.printStackTrace(); } }
		 */

		/*
		 * Try - With - Resources =========================
		 * 
		 * try(resources init){ //statements }catch(...) {
		 * 
		 * }
		 */

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination));
				BufferedReader bufferedReader = new BufferedReader(new FileReader(source));) {

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
