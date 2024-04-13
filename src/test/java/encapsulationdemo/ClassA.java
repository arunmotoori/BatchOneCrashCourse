package encapsulationdemo;

public class ClassA {
	
	private int a = 5;
	
	private void sampleA() {
		
		System.out.println("Inside sampleA method");
		
	}
	
	public int getVariable() {
		return a;
	}
	
	public void callSampleA() {
		
		sampleA();
		
	}

}
