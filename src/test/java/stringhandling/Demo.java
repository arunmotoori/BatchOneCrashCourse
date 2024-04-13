package stringhandling;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX1 = new Car("BMW","X1");
		bmwX1.startCar();
		bmwX1.stopCar();

		System.out.println(bmwX1);
		System.out.println(bmwX1.toString());
		
	}

}
