package Buoi6;
import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {
	public static void main(String[] args) {
		System.out.println(readFile());
	}
	
	public static String readFile() {
		String path = "C:\\Users\\daibu\\PycharmProjects\\100_Bai_Tap_Python\\google.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			return br.readLine();
		} catch (Exception e) {
			System.out.println("demo try with resource");
		}
		return null;
	}
}
