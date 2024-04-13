package scannerdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your expereince here:");
		try {
			int experience = sc.nextInt();
			
			if(experience>15) {
				System.out.println("You can apply for this interview");
			}else {
				System.out.println("You cannot apply for this interview");
			}
		}catch(InputMismatchException e) {
			System.out.println("Invalid input entered.");
		}

	}

}
