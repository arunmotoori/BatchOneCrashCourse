package twodimensonalarrays;

public class ClassF {

	public static void main(String[] args) {
		
		// int[] a = {6,0,8,2}
		
		int[][] ar = {{9,5,7,1},{6,0,8,2},{3,4,9,6}};
		
		for(int[] m : ar) {
			
			for(int n : m) {
				
				System.out.println(n); // 9 5 7 1 6 0 8 2 3 4 9 6 
				
			}
			
		}
		

	}

}
