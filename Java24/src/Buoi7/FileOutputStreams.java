package Buoi7;

import java.io.FileOutputStream;

public class FileOutputStreams {
	//4h45'
	//khi ghi vao file, thi se delete tat ca du lieu dang co
	//va ghi de len
	public static void main(String[] args) throws Exception {
		try {
			FileOutputStream f = new FileOutputStream("C:\\Users\\daibu\\Dropbox\\Self Study\\Text.txt");
			String s = "write file demo";
			//convert string into byte array
			byte buf[] = s.getBytes();
			f.write(buf);
			f.close();
			System.out.println("Successfully ghi file");
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}	
	}
}
