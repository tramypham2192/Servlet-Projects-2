package Buoi6;
import java.util.Scanner;

public class Exceptions {
	public static void tinhTong() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap so thu nhat: ");
			int num1 = sc.nextInt();
			System.out.println("Nhap so thu hai: ");
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		try {
			obj.display();
		} catch (Exception e) {
			System.out.println("Runtime exception 1");
		}
//		tinhTong();
		
		System.out.println("new day");
	}
}

class ThrowDemo  {
	public static void display() throws Exception {
		throw new Exception();
	}
}
