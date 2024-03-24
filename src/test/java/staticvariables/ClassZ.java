package staticvariables;

public class ClassZ {
	
	int price; // Instance Global Variable
	static int wheels = 4; // Static Global variable
	
	//Instance method
	public static void sampleZ() {
		
		int b = 10; // Local variables cannot be static
		System.out.println(b);
	}
	
	//Static method
	public static void sampleX() {
		
		int d = 20;
		System.out.println(d);
		
	}

}
