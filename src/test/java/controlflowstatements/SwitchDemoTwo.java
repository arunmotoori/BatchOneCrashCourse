package controlflowstatements;

public class SwitchDemoTwo {

	public static void main(String[] args) {
		
		String foodItem = "burger";
		
		switch(foodItem) {
		
		case "pizza": 
			System.out.println("Here is your pizza.");
		case "burger":
			System.out.println("Here is your burger");
		case "noodles":
			System.out.println("Here are your noodles");
		case "pasta":
			System.out.println("Here is your pasta");
		default:
			System.out.println("We only serve pizza/burger/noodles/pasta");
		
		}

	}

}
