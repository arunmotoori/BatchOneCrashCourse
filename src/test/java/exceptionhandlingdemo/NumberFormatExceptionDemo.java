package exceptionhandlingdemo;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		
		//String str = "9";
		String str = "Arun";
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}catch(NumberFormatException nfe) {
			System.out.println("Handled the exception: "+nfe);
		}
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
