package stringhandling;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String str1 = "Arun";
		String str2 = "Varun";
		String str3 = "Arun";  // Shortcut representation
		String str4 = "arun";  // Shortcut
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equals(str3)); // true
		System.out.println(str1.equals(str4)); // false
		
		System.out.println("-----------------");
		
		System.out.println(str1==str2); // false
		System.out.println(str1==str3); // true
		System.out.println(str1==str4); // false
		
		System.out.println("-----------------");
		
		int a = 9;
		int b = 5;
		int c = 9;
		
		System.out.println(a==b); // false
		System.out.println(a==c); // true
		
		System.out.println("--------------------");
		
		String w = new String("Arun");
		String x = new String("Varun");
		String y = new String("Arun"); // Actual Representation
		String z = new String("arun"); 
		
		System.out.println(w.equals(x));  //false
		System.out.println(w.equals(y));  //true
		System.out.println(w.equals(z));  //false
		
		System.out.println("------------------");
		
		System.out.println(w==x); // false
		System.out.println(w==y); // false
		System.out.println(w==z); // false
		
		

	}

}
