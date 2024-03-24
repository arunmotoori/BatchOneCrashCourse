package overridingdemo;

public class ClassA {
	
	int a = 10;
	
	public void sampleA() {
		
		System.out.println("Inside sampleA method - ClassA");
		
	}

}

class ClassB extends ClassA{
	
	int b = 20;
	
	@Override
	public void sampleA() {
		
		System.out.println("Inside sampleA method - ClassB");
		
	}
	
	public void sampleB() {
		
		System.out.println("Inside sampleB method");
		
	}
	
}
