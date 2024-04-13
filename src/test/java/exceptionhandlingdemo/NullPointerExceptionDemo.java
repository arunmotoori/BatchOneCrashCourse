package exceptionhandlingdemo;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
		//String str = "Arun";
		String str = null;
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException ne) {
			System.out.println("Handled the exception: "+ne);
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
