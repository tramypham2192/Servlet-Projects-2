package File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter =  new FileWriter("January 7.txt");
			myWriter.write("Today is January 7 in 2022.");
			myWriter.close();
			System.out.println("Wrote to file.");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
