package stringhandling;

public class EqualsIgnoreCaseDemo {

	public static void main(String[] args) {
		
		String str1 = "Arun";
		String str2 = "Varun";
		String str3 = "arun";
		String str4 = "Arun";
		
		System.out.println(str1.equalsIgnoreCase(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str3)); // true
		System.out.println(str1.equalsIgnoreCase(str4)); // true

	}

}
