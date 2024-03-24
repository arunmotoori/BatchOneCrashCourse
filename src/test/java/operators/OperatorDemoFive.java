package operators;

public class OperatorDemoFive {

	public static void main(String[] args) {
		
		int a = 9, b = 4, c = 12, d = 3, e = 3;
		
		System.out.println(a>b);  // true
		System.out.println(a>c);  // false
		System.out.println(d>e);  // false
		
		System.out.println(b<c); // true
		System.out.println(a<b); // false
		System.out.println(d<e); // false
		
		System.out.println(a>=b); // true
		System.out.println(a>=c); // false
		System.out.println(d>=e); // true
		
		System.out.println(b<=c); // true
		System.out.println(a<=b); // false
		System.out.println(d<=e); // true
		
		System.out.println(a==b); // false
		System.out.println(b==c); // false
		System.out.println(d==e); // true
		
		System.out.println(a!=b); // true
		System.out.println(b!=c); // true
		System.out.println(d!=e); // false
		
	}

}
