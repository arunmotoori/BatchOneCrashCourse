package controlflowstatements;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			if(i==4) {
				System.out.println("Inside if block");
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
