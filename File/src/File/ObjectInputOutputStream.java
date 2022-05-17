package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream {
	public static void main(String[] args) {
		int data1 = 5;
		String data2 = "This is programiz";
		
		try {
			FileOutputStream file = new FileOutputStream("file.txt");
			
			//Creates an ObjectOutputStream
			ObjectOutputStream output = new ObjectOutputStream(file);
			
			//writes objects to output stream
			output.writeObject(data1);
			output.writeObject(data2);
			
			//Reads data using the ObjectInputStream
			FileInputStream fileStream = new FileInputStream("file.txt");
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			objStream.close();
			int i = 0;
			while ((i = objStream.read()) != -1) {
				System.out.println((char)i);
				System.out.println("String data: " + objStream.readObject());	
			}
			output.close();
			System.out.println("he"); 

			
		} catch (Exception e) {
			System.out.println("Co loi xuat hien");
			System.out.println(e);
			e.getStackTrace();
		}
	}
}
