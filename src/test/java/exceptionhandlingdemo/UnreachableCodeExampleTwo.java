package exceptionhandlingdemo;

public class UnreachableCodeExampleTwo {

	public static void main(String[] args) {
		
		sampleOne();
		
	}
	
	public static void sampleOne() {
		
		System.out.println("Starting of sampleOne method");
		
		return;
		
		//System.out.println("Ending of sampleOne method");
		
	}

}
