package stringhandling;

public class ContainsDemo {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
		boolean b = str.contains("Java");
		
		if(b) {
			System.out.println("Item found");
		}else {
			System.out.println("Item not found");
		}

	}

}
