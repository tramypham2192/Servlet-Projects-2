package File;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile {
	public static void main(String[] args) {
		//create dictionary
		Dictionary<String, Integer> dictionary = new Hashtable<>();
		int count = 0;

		try {
			File myObj = new File("January 7.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
//				System.out.println(data);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap ki tu can count frequency: ");
				String stringToCount = sc.next();
				
				
				
				//create list of characters in data
				String str[] = data.split("");
				for (String s: str) {
					System.out.print(s + " ");
				}
				List<String> al = new ArrayList<String>();
				al =  Arrays.asList(str);
				
				//count and add into dictionary
				for (String s: al) {
					if (s.equals(stringToCount)) {
						count += 1;
						dictionary.put(stringToCount, count);
					}
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	System.out.println(dictionary);	
		
	}  
}
