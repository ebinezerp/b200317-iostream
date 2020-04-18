package iostreams;

public class FileCopyApplication {
	
	public static void main(String[] args) {
		
		FileCopy fileCopy = new FileCopy("E:/iodemo/demo2.txt", "E:/iodemo/copydemo.txt");
		
		
		fileCopy.copy();
		
		System.out.println("File copy is completed");
		
	}

}
