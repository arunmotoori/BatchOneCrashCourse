package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		try {
			int num = scanner.nextInt();
			System.out.println("You have entered: "+num);
		}catch(InputMismatchException e) {
			System.out.println("Exception got handled here: "+e);
		}finally {
			scanner.close();
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
