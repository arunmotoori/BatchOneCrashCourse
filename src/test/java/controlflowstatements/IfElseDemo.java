package controlflowstatements;

public class IfElseDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of the program.");
		
		int a = 5, b = 4;
		
		if(a>b) {
			
			System.out.println("Inside if block");
			System.out.println("a is greater than b");
			
		} else {
			
			System.out.println("Inside else block");
			System.out.println("a is less than b");
			
		}
		
		System.out.println("End of the program.");

	}

}
