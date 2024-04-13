package twodimensonalarrays;

public class ClassC {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1},{6,0,8,2},{3,4,9,6}};
		
		System.out.println(ar.length); // Size of the main array
		System.out.println(ar[0].length); // Size of 1st ele's single dimensional array
		System.out.println(ar[1].length); // Size of 2nd ele's single dimensional array
		System.out.println(ar[2].length); // Size of 3rd ele's single dimensional array
		
		System.out.println("---------------");
		
		System.out.println(ar[0][0]); 
		System.out.println(ar[0][1]); 
		System.out.println(ar[0][2]); 
		System.out.println(ar[0][3]);
		
		System.out.println(ar[1][0]);
		System.out.println(ar[1][1]);
		System.out.println(ar[1][2]);
		System.out.println(ar[1][3]);
		
		System.out.println(ar[2][0]);
		System.out.println(ar[2][1]);
		System.out.println(ar[2][2]);
		System.out.println(ar[2][3]);

	}

}
