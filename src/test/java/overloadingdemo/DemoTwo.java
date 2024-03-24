package overloadingdemo;

public class DemoTwo {
	
	public void sample() {
		
		Car c = new Car();
		System.out.println(c.company);
		System.out.println(c.model);
		c.startCar();
		c.stopCar();
		System.out.println(Car.wheels);
		Car.carDetails();
		
	}

}
