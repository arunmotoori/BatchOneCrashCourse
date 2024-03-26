package abstractmodifierdemo;

public class Demo {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		
		cb.sampleAOne();
		cb.sampleATwo();
		cb.sampleAThree();
		
		//ClassA ca = new ClassA();
		
		ClassA ca = new ClassB();
		
		ca.sampleAOne();
		ca.sampleATwo();

	}

}
