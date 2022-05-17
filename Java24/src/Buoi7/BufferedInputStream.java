package Buoi7;
import java.io.*;
import java.io.FileInputStream;

public class BufferedInputStream {
	//4h00phut
	public static void main(String[] args) throws IOException{
		FileInputStream f = new FileInputStream("C:\\Users\\daibu\\Dropbox\\Self Study\\Text.txt");
//		byte buf[] = ((String) f).getBytes();
		try {
//			ByteArrayInputStream in = new ByteArrayInputStream(buf);
			BufferedInputStream bf = new BufferedInputStream(f);
			int i;
			while ((i == f.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			throw e;
		}
	}
}
