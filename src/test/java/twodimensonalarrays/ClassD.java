package twodimensonalarrays;

public class ClassD {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1},{6,0,8,2},{3,4,9,6}};
		
		for(int i=0;i<3;i++) { // 3
			
			for(int j=0;j<4;j++) {  // 4
				
				System.out.println(ar[i][j]); // 9 5 7 1 6 0 8 2 3 4 9 6 
				
			}
			
		}
	
	}

}
