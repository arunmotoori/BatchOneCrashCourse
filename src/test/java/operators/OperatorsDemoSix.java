package operators;

public class OperatorsDemoSix {

	public static void main(String[] args) {
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		int a = 3, b = 4, c = 5;
		
		System.out.println(a<b && b<c);  // true && true - true
		
	} 

}
