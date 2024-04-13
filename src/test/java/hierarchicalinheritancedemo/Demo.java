package hierarchicalinheritancedemo;

public class Demo {

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		System.out.println(ca.p);
		System.out.println(ca.a);
		
		ClassB cb = new ClassB();
		System.out.println(cb.p);
		System.out.println(cb.b);

	}

}
