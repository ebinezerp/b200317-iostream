package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(101, "kumar", 30000F);
		
		
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objectdemo.txt"));
			
			objectOutputStream.writeObject(employee);
			objectOutputStream.flush();
			objectOutputStream.close();
			
			
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objectdemo.txt"));
			Employee retrivedObject = (Employee) objectInputStream.readObject();
			System.out.println(retrivedObject);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
