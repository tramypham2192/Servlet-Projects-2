package Buoi7;
import java.io.*;

public class DocGhiFile {
	public static void main(String[] args) throws IOException {
		//i de doc tung dong cua file
		int i;
		//char de doc tung ky tu trong file
		char c;
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\daibu\\Dropbox\\Self Study\\Text.txt");
			//gan kieu byte cho kieu int
			while ((i = f.read()) != -1) {
				c = (char)i;
				System.out.print(c);
			}
		} catch (IOException e) {
			throw e;
		}
	}
}
