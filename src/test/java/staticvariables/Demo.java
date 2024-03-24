package staticvariables;

public class Demo {

	public static void main(String[] args) {
		
		ClassZ cz = new ClassZ();
		cz.price = 100;
		System.out.println(cz.price);
		ClassZ.sampleZ();
		
		System.out.println(ClassZ.wheels);
		ClassZ.sampleX();
		ClassZ.sampleZ();

	}

}
