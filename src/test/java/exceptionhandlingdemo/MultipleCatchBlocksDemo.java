package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocksDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter any number:");
			int b = scanner.nextInt();
			scanner.close();
			int a = 9;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException got handled here");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchExcpetion got handled here");
		}catch(Exception e) {
			System.out.println("Excpetion got handled here");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
