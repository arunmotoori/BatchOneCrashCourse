package stringhandling;

// Object class is the parent class of all the classes in Java
// toString()


public class ClassP {
	
	int a = 10;
	
	public void sample() {
		System.out.println("sample-ClassP");
	}
	
	@Override
	public String toString() {
		
		return "Arun";
		
	}

}

class ClassC extends ClassP{
	
	int b = 20;
	
	@Override
	public void sample() {
		System.out.println("sample-ClassC");
	}
	
}
