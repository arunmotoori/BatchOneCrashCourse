package overridingdemo;

public class ClassOne {
	
	public void methodOne() {
		
		System.out.println("Inside methodOne of ClassOne");
		
	}
	
	public void methodOne(int a,int b) {
		
		
	}

}

class ClassTwo extends ClassOne{

	//Overloading
	public void methodOne(int a) {
		
		System.out.println("Inside methodOne of ClassTwo");
		
	}
	
}
