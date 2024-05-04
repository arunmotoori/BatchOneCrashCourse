package doubts;

public class Animal {
	
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}

}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Bow Bow");
	}
	
	public void run() {
		System.out.println("Dog is runing");
	}
	
}

class Cat extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Meow Meow");
	}
	
	public void climb() {
		System.out.println("Cat is climbling");
	}
	
}
