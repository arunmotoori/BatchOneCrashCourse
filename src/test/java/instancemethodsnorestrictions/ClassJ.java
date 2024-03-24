package instancemethodsnorestrictions;

public class ClassJ {
	
	int a = 10;
	static int b = 15;
	
	public void sampleJ() {
		
		System.out.println(a);
		System.out.println(b);
		sampleA();
		sampleB();
		
	}
	
	public void sampleA() {
		
		System.out.println("Inside sampleA");
		
	}
	
	public static void sampleB() {
		
		System.out.println("Inside sampleB");
	}

}
