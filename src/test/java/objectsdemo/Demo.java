package objectsdemo;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX1 = new Car();
		
		bmwX1.company = "BMW";
		bmwX1.model = "X1";
		bmwX1.color = "Blue";
		bmwX1.price = 6000000;
		bmwX1.milage = 16.54;
		bmwX1.wheels = 4;
		
		bmwX1.startCar();
		bmwX1.stopCar();
		bmwX1.carDetails();
		
		Car benzC = new Car();
		
		benzC.company = "Benz";
		benzC.model = "CClass";
		benzC.color = "Grey";
		benzC.price = 7000000;
		benzC.milage = 14.21;
		benzC.wheels = 4;
		
		benzC.startCar();
		benzC.stopCar();
		benzC.carDetails();
	

	}

}
