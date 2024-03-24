package methods;

public class MethodDemoSix {

	public static void main(String[] args) {
		
		System.out.println("Start of main method");
		
		sampleOne();
		
		System.out.println("End of main method");
	}
	
	public static void sampleOne() {
		
		System.out.println("Start of sampleOne method");
		
		sampleTwo();
		
		System.out.println("End of sampleOne method");
		
	}
	
	public static void sampleTwo() {
		
		System.out.println("Start of sampleTwo method");
		
		System.out.println("End of sampleTwo method");
		
	}

}
