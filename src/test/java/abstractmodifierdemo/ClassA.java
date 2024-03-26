package abstractmodifierdemo;

public abstract class ClassA {
	
	//abstract int a = 5;
	
	public void sampleAOne() {
		
		System.out.println("Inside sampleAOne method");
		
	}
	
	public abstract void sampleATwo();

}

class ClassB extends ClassA {
	
    public void sampleATwo() {
		
		System.out.println("Inside sampleATwo");
		
	}
	
   
	public void sampleAThree() {
		
		System.out.println("Inside sampleAThre");
		
	}
	
}


