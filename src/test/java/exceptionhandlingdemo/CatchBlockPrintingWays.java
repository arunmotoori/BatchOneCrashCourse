package exceptionhandlingdemo;

import java.util.Scanner;

public class CatchBlockPrintingWays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int userInput = scanner.nextInt();
		scanner.close();
		int a = 9;
		try {
			int c = a/userInput;
			System.out.println(c);
		}catch(ArithmeticException ae) {
			//System.out.println(ae);
			//System.out.println(ae.toString());
			//System.out.println(ae.getMessage());
			//System.out.println(ae.getClass());
			//System.out.println("ArithmeticException got handled here.");
			ae.printStackTrace();
	
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
