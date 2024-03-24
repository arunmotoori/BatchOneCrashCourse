package controlflowstatements;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			if(i==3) {
				System.out.println("Inside if block");
				break;
			}
			
			System.out.println(i);
			
		}

	}

}
