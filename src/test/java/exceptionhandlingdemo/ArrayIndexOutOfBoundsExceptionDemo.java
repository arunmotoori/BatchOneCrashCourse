package exceptionhandlingdemo;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		try {
			ar[0] = 9;
			ar[1] = 5;
			ar[2] = 7;
			ar[3] = 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception got handled here: "+e);
		}
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		//System.out.println(ar[3]);
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
