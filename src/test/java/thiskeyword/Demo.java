package thiskeyword;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX1 = new Car();
		
		bmwX1.inCarVars("BMW", "X1", "Blue",6000000,16.54,4);
		
		bmwX1.startCar();
		bmwX1.stopCar();
		bmwX1.carDetails();
		
		Car benzC = new Car();
		
		benzC.inCarVars("Benz", "CClass", "Grey",7000000,14.21,4);
				
		benzC.startCar();
		benzC.stopCar();
		benzC.carDetails();
	

	}

}
