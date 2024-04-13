package exceptionhandlingdemo;

import java.util.Scanner;

public class CustomizedExceptionDemo {

	public static void main(String[] args) throws ArunException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your kids age:");
		int age = scanner.nextInt();
		scanner.close();
		if(age<=10) {
			System.out.println("Your kid can play at Arun Garden");
		}else {
			throw new ArunException("Your kids age is not suitable for Arun Garden");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		
	}

}

class ArunException extends Exception{
	
	public ArunException(String message) {
		super(message);
	}

}
