package stringhandling;

import java.util.Scanner;

public class LengthMethodDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any text:");
		String s = sc.nextLine();
		//String s = sc.next();
		System.out.println(s.length());

	}

}
