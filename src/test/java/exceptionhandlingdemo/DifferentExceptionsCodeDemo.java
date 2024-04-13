package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferentExceptionsCodeDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter any number:");
			int b = scanner.nextInt();
			scanner.close();
			int a = 9;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException | InputMismatchException e) {  //Exception
			System.out.println("Exception got handled here: "+e);
		}
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		

	}

}
