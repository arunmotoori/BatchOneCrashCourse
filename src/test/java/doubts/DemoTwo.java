package doubts;

public class DemoTwo {

	public static void main(String[] args) {
		
		/*
		Animal a = new Dog();
		a.makeSound();
		a.eat();
		*/
		
		
		Animal a = new Dog();
		a.makeSound();
		a.eat();
		
		Dog d = (Dog)a;
		d.run();
		
	}

}
