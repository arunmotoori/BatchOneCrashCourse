package singlelevelinheritancedemo;

public interface InterfaceA {
	
	int a = 5;
	
	public void sampleA();

}

interface InterfaceB extends InterfaceA{
	
	int b = 10;
	
	public void sampleB();
	
}

class ClassC implements InterfaceB{
	
	int c = 15;

	@Override
	public void sampleA() {
		System.out.println("Inside sampleA");
		
	}

	@Override
	public void sampleB() {
		System.out.println("Inside sampleB");
	}
	
	public void sampleC() {
		
		System.out.println("Inside sampleC");
		
	}
	
}