package overloadingdemo;

public class Car {
	
	String company = "Benz";
	String model = "C Class";
	static int wheels = 4;
		
	public void startCar(){
		System.out.println("Car started");
		
		/*
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		c1.startCar();
		c1.stopCar();
		*/
		
		System.out.println(company);
		System.out.println(model);
		stopCar();
		
	}
	
	public void stopCar() {
		System.out.println("Car stopped");
	}
	
	public static void carDetails() {
		System.out.println("Car Details");		
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(c.company);
		System.out.println(c.model);
		c.startCar();
		c.stopCar();
		
		System.out.println(wheels);
		carDetails();
	}
	
}