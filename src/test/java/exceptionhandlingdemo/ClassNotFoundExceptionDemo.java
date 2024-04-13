package exceptionhandlingdemo;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args)  {
		
		try {
			Class c = Class.forName("Arun");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
