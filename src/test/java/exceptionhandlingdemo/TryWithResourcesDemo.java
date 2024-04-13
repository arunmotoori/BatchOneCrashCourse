package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter any number:");
			int num = scanner.nextInt();
			System.out.println("You have entered: "+num);
		}catch(InputMismatchException e) {
			System.out.println("Exception handled: "+e);
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
	}

}
