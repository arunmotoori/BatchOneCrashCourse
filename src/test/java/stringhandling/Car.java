package stringhandling;

public class Car {
	
	String company;
	String model;
	
	public Car(String company,String model) {
		this.company = company;
		this.model = model;
	}

	public void startCar() {
		System.out.println("Car from "+company+" having model "+model+" has started");
	}
	
	public void stopCar() {
		System.out.println("Car from "+company+" having model "+model+" has stopped");
	}
	
	@Override
	public String toString() {
		
		return model+" from "+company;
		
	}
	
}
