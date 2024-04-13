package stringhandling;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		String str = "My name is Arun Motoori and I love Java programming";
		
		String result = str.replace('o','$');
		String result2 = str.replace("Java","Python");
		
		System.out.println(str);
		System.out.println(result);
		System.out.println(result2);

	}

}
