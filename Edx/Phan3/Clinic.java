package Phan3;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class Clinic {
	File patientFile;
	static int day = 1;
	
	public Clinic (File file) {
		this.patientFile = file;
	}
	
	public Clinic (String fileName) {
		this(new File(fileName));
	}
	
	//method nextDay returns a String
	public static String nextDay(String fileName) throws InvalidPetException, IOException {
		//read file appointment.csv
		Scanner scanner = new Scanner(new File(fileName));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.print(scanner.next() + ",");
		}
		System.out.println();
		//take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the pet: ");
		String petName = sc.next();
		String petType = "";
		try {
			System.out.println("Enter the type of pet, Dog or Cat: ");
			petType = sc.next();
		} catch (Exception e) {
			if (!(petType.equals("Dog") || petType.equals("Cat"))) {
				throw new InvalidPetException();
			}
		}
		System.out.println("Enter the health of the pet on scale 0 to 1.0: ");
		double petHealth = sc.nextDouble();
		System.out.println("Enter pain level on a scale of 10: ");
		int petPainLevel = sc.nextInt();
		
		//write to csv file
		PrintWriter pw;
		while (true) {
			int day = 1;
			try {
				pw = new PrintWriter(new FileWriter("C:\\Users\\daibu\\Dropbox\\Self Study\\Projects\\PetClinic\\testthu.csv", true));
				
				StringBuffer csvHeader = new StringBuffer("");
				StringBuffer csvData = new StringBuffer("");
				csvHeader.append("Name, Type, Health, Pain level\n");
				
				//write Header
				pw.write(csvHeader.toString());
				
				//write data
				csvData.append(petName);
				csvData.append(petType);
				csvData.append(petHealth);
				csvData.append(petPainLevel);
				pw.write(csvData.toString());
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			day++;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		try {
			nextDay("C:\\Users\\daibu\\Downloads\\Appointments.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
