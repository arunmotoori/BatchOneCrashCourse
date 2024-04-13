package twodimensonalarrays;

public class ClassE {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1},{6,0,8,2},{3,4,9,6,2}};
		
		for(int i=0;i<ar.length;i++) { // 1
			
			for(int j=0;j<ar[i].length;j++) {  // 0
				
				System.out.println(ar[i][j]); // 9 5 7 1 6 0 8 2 3 4 9 6 
				
			}
			
		}

	}

}
