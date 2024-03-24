package staticmethodrestrictions;

public class ClassK {
	
	int a = 10;
	static int b = 15;
	
	public static void main(String[] args) {
		
		ClassK ck = new ClassK();
		System.out.println(ck.a);
		System.out.println(b);
		ck.sampleA();
		sampleB();
		
	}
	
	public void sampleA() {
		
		System.out.println("Inside sampleA");
		
	}
	
	public static void sampleB() {
		
		System.out.println("Inside sampleB method");
		
	}
	
	

}
