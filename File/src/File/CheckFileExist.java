package File;

import java.io.File;
import java.io.IOException;

public class CheckFileExist {
	public static void main(String[] args) {
		File fileObj = new File("C:\\Users\\daibu\\Dropbox\\Self Study\\File\\TextJan.txt");
		
		if (fileObj.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File does not exists");
			try {
				fileObj.createNewFile();
				System.out.println("Create file successfully");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
