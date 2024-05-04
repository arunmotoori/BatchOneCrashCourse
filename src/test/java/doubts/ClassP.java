package doubts;

public class ClassP {
	
	public void sampleOne() {
		System.out.println("Inside sampleOne method of ClassP");
	}

}

class ClassCA extends ClassP{
	
	@Override
	public void sampleOne() {
		System.out.println("Inside sampleOne method of ClassCA");
	}
	
	public void sampleTwo() {
		System.out.println("Inside sampleTwo method of ClassCA");
	}
	
}
