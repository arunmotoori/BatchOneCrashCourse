package objectsdemo;

public class Car {
	
	String company;
	String model;
	String color;
	double price;
	double milage;
	int wheels;
	
	public void startCar() {
		
		System.out.println("Car from company: "+company+" and from model: "+model+" has started");
	
	}
	
	public void stopCar() {
		
		System.out.println("Car from company: "+company+" and from model: "+model+" has stopped");
		
	}
	
	public void carDetails() {
		
		System.out.println("Company of the car is: "+company);
		System.out.println("Model of the car is: "+model);
		System.out.println("Color of the car is: "+color);
		System.out.println("Price of the car is: "+price);
		System.out.println("Milage of the car is: "+milage);
		System.out.println("Number of wheels of the car is: "+wheels);
		System.out.println("-------------");
	}
	

}
