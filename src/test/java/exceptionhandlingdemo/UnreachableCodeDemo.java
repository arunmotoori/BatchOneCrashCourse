package exceptionhandlingdemo;

public class UnreachableCodeDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			
			if(i==2)
			   break;
			
			System.out.println("Inside for loop");
			
		}

	}

}
