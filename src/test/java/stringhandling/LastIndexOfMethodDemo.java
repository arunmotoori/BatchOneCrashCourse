package stringhandling;

import java.util.Scanner;

public class LastIndexOfMethodDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter search term here:");
		
		String searchText = sc.next();
		
		sc.close();
		
		String str = "I love Java Programming and Java is an easy language";
		
		System.out.println(str.lastIndexOf(searchText));
		
		if(str.lastIndexOf(searchText)!=-1) {
			System.out.println("Search Text Found");
		}else {
			System.out.println("Search Text not found");
		}
		

	}

}
