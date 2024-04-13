package exceptionhandlingdemo;

import java.util.Scanner;

public class ExceptionHierarcyDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int b = scanner.nextInt();
		scanner.close();
		int a = 9;
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {   // ArithmeticException/RuntimeException/Exception/Throwable
			System.out.println("Handled exception: "+e);
		}
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
