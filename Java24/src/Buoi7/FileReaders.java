package Buoi7;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
	//4h25
	public static void main(String[] args) throws IOException {
		try {
			FileReader f = new FileReader("");
			//array nay phai co so element nhieu hon so ky tu trong file
			//neu mang co so element it hon so ky tu trong file 
			//thi se chi display ra tung nay element thoi
			char []a = new char [500];
			f.read(a);
			//khong dung while ma dung for each
			for (char c : a) {
				System.out.print(c);
			}
		} catch (IOException e) {
			throw e;
		}
	}
}
