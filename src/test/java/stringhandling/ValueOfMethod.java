package stringhandling;

public class ValueOfMethod {

	public static void main(String[] args) {
		
		int num = 9;
		System.out.println(num+1); // 10   true
		
		String str = String.valueOf(num);  // "9"  // "true"
		System.out.println(str+1); // 91
		
		double d = 3.45;
		System.out.println(3.45+1);
		
		String str2 = String.valueOf(d); // "3.45"
		System.out.println(str2+1);

		/*
		String str = "9";
		System.out.println(str+1); // 91
		
		int num = Integer.parseInt(str);
		System.out.println(num+1); // 10
		
		Integer num2 = Integer.valueOf(str);
		System.out.println(num2+1); // 10
		*/
		

	}

}
