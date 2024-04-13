package stringhandling;

public class StringImmutableTwo {

	public static void main(String[] args) {
		
		String str = "Arun Motoori";
		
		String str1 = str.replace("Arun","Varun");
		
		System.out.println(str);
		System.out.println(str1);
		
		String firstName = "Arun";
		String fullName = firstName.concat("Motoori");
		System.out.println(fullName);
		
		/*
		StringBuilder sb = new StringBuilder("Arun ");
		sb.append("Motoori");
		System.out.println(sb);
		*/

	}

}
