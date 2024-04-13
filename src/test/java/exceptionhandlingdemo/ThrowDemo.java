package exceptionhandlingdemo;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) throws Exception  {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		scanner.close();
		
		if(age>=18) {
			System.out.println("You can watch this movie");
		}else {
			throw new Exception("You must have 18+ years of age to watch this movie.");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
