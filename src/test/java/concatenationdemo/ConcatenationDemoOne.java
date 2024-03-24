package concatenationdemo;

public class ConcatenationDemoOne {

	public static void main(String[] args) {
		
		System.out.println(5+4); // Addition // 9
		
		int a = 3, b = 5;
		
		System.out.println(a+b); // Addition // 8
		
		System.out.println("Arun"+9); // Concatenation //  Arun9
		
		System.out.println(9+"Arun"); // Concatenation // 9Arun
		
		System.out.println(3+2+"Arun"); // 5Arun 
		
		System.out.println("Arun"+3+2); // Arun32
		
		String firstName = "Arun";
		String lastName = "Motoori";
		
		System.out.println(firstName+" "+lastName);
		
		int x = 3, y = 4;
		int sum = x+y;
		
		System.out.println("The addition of "+x+" and "+y+" is: "+sum); // The addition of 3 and 4 is 7
		System.out.println("The addition of "+x+" and "+y+" is: "+x+y); // The addition of 3 and 4 is 34
		System.out.println("The addition of "+x+" and "+y+" is: "+(x+y)); // The addition of 3 and 4 is 7
	}

}
