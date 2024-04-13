package escapesequencesdemo;

public class EscapeSequencesDemo {

	public static void main(String[] args) {
		
		String str1 = "I 'love' \"Java\" programming"; //    \"
		System.out.println(str1);
		
		String str2 = "I love Java programming.\nJava is an easy language.";
		System.out.println(str2);
		
		String str3 = "I\tlove\tJava\tProgramming";
		System.out.println(str3);
		
//		String str4 = "Ar\bun";
//		System.out.println(str4);
		
//		String str5 = "I love Java Programming.\rJava is easy.";
//		System.out.println(str5);
		
//		String str6 = "Page1\fPage2";
//		System.out.println(str6);
		
		String str7 = "Arun\\Motoori";
		System.out.println(str7);
		
		char c = '\'';
		System.out.println(c);
		
	}

}
