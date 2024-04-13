package stringhandling;

public class MatchesDemo {

	public static void main(String[] args) {
		
		String str = "AaaZ";
		
		boolean b = str.matches("A.{2}Z");  // Regular Expression - RegEx
		
		if(b) {
			System.out.println("RegEx matched");
		}else {
			System.out.println("RegEx not matched");
		}

	}

}
