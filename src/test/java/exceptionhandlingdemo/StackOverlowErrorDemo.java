package exceptionhandlingdemo;

public class StackOverlowErrorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		sampleOne();

	}
	
	public static void sampleOne() throws InterruptedException {
		
		//System.out.println("Inside sampleOne method");
		
		//Thread.sleep(1);
		
		sampleTwo();
		
	}
	
	public static void sampleTwo() throws InterruptedException {
		
		//System.out.println("Inside sampleTwo method");
		try {
		    sampleOne();
		}catch(Throwable t) {
			System.out.println("StackOverflowError got resolved");
			return;
		}
		
	}

}
