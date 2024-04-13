package singlelevelinheritancedemo;

public class Demo {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		
		System.out.println(cb.a);
		System.out.println(cb.b);
		cb.sampleA();
		cb.sampleB();

	}

}
