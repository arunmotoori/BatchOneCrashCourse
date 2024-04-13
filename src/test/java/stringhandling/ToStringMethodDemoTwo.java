package stringhandling;

public class ToStringMethodDemoTwo {
	
	public String toString() {
		
		return "Harry Porter";
		
	}

	public static void main(String[] args) {
		
		String str = "Arun";
		
		System.out.println(str);
		System.out.println(str.toString());
		
		Integer n = 9;
		
		System.out.println(n);
		System.out.println(n.toString());
		
		ToStringMethodDemoTwo udc = new ToStringMethodDemoTwo();
		System.out.println(udc);
		System.out.println(udc.toString());

	}
	
	

}
