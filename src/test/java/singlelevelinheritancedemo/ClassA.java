package singlelevelinheritancedemo;

public class ClassA {
	
	int a = 5;
	
	public void sampleA() {
		
		System.out.println("Inside sampleA");
		
	}

}

class ClassB extends ClassA{
	
	int b = 10;
	
	public void sampleB() {
		
		System.out.println("Inside sampleB");
		
	}
	
}
