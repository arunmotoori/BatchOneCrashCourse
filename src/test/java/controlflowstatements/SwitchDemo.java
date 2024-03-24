package controlflowstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String foodItem = "donut";
		
		switch(foodItem) {
		
		case "pizza": 
			System.out.println("Here is your pizza.");
			break;
		case "burger":
			System.out.println("Here is your burger");
			break;
		case "noodles":
			System.out.println("Here are your noodles");
			break;
		case "pasta":
			System.out.println("Here is your pasta");
			break;
		default:
			System.out.println("We only serve pizza/burger/noodles/pasta");
		
		}
		
		

	}

}
