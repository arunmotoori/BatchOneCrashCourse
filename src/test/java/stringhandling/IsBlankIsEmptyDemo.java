package stringhandling;

import java.util.Scanner;

public class IsBlankIsEmptyDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter some string text here:");
		
		String s = scanner.nextLine();
		
		scanner.close();
		
		if(s.isEmpty()) {
			System.out.println("Given string is empty");
		}else {
			System.out.println("Given string is not empty");
		}
		
		if(s.isBlank()) {
			System.out.println("Given String is blank");
		}else {
			System.out.println("Given string is not blank");
		}
		
		/*
		String str1 = "Arun";
		String str2 = "";
		String str3 = "      ";
		
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
		System.out.println(str3.isBlank());
		
		// All blanks are not empty
		// All empty are blanks
		 * 
		 * 
		 */

	}

}
