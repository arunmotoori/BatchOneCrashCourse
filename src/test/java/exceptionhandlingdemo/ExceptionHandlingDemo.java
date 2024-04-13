package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		int a=9,b=1,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		try {
			b = scanner.nextInt();
		}catch(InputMismatchException ise) {
			System.out.println("Decimal values are not allowed. You have to enter a non-decimal number.");
		}
		scanner.close();

		try {
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException ae) {
			System.out.println("Zero is not allowed.You have to enter a postive number greater than zero.");
		}
		
		int d = 5, e = 4;
		int f = d * e;
		System.out.println(f);
		System.out.println("End of this program");

	}

}
