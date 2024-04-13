package encapsulationdemo;

public class ClassD {

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		
		int vara = ca.getVariable();
		System.out.println(vara);
		
		ca.callSampleA();

	}

}
