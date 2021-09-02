package input;

import java.util.Scanner;

public class ScannerExmaple {

	// Main Method
	public static void main(String[] args) {
		// Creating BuferedReader Object
		// InputStreamReader converts bytes to
		// stream of character
		Scanner scanner = new Scanner(System.in);

		// Asking for input from user
		System.out.print("Enter Name : ");

		// String reading internally
		String stringValue = scanner.next();
		System.out.print("Enter Age : ");

		// Integer reading internally
		int integerValue = scanner.nextInt();
		
		// Printing String
		System.out.println("Entered Name : " + stringValue);

		// Printing Integer
		System.out.println("Entered Age : " + integerValue);

		scanner.close();

	}

}