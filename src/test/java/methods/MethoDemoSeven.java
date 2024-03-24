package methods;

public class MethoDemoSeven {

	public static void main(String[] args) {
		
		welcomeName("Arun"); 
		addTwoNumbers(4,5);
		addNums(9,3);
		addNums(9,3.2);
		//addNums(3.2,9);
	}
	
	public static void welcomeName(String name) {  
		
		System.out.println("Welcome "+name);
		
	}
	
	public static void addTwoNumbers(int x,int y) {
		
		System.out.println("The sum of "+x+" and "+y+" is: "+(x+y));
		
	}
	
	public static void addNums(int x,double y) {
		
		System.out.println(x+y);
		
	}

}
