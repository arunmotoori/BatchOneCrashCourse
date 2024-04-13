package exceptionhandlingdemo;

public class ExceptionPropagandaDemo {

	public static void main(String[] args)  {
	
		sampleOne();

	}
	
	public static void sampleOne()  {
		
		try {
		sampleTwo();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
	public static void sampleTwo() throws InterruptedException {
		
		sampleThree();
		
	}
	
	public static void sampleThree() throws InterruptedException {
		
		Thread.sleep(10000);
		
	}

}
