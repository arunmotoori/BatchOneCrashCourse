package methods;

public class MethodDemoEight {

	public static void main(String[] args) {
		
		sample(4,5);
		int s = addTwoNumbers(3,2);
		System.out.println(s);
	
	}
		
	public static void sample(int x,int y) {
		
		System.out.println(x+y);
		
	}
	
	public static int addTwoNumbers(int x,int y) {
		
		int sum = x + y;
		
		return sum;
		
	}

}
