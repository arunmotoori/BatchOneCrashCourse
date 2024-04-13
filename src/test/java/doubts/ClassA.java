package doubts;

public class ClassA {

	public static void main(String[] args) {
		
		sampleA();

	}
	
	public static void sampleA() {
		
		for(int i=1;i<=10;i++) {  //6
				
			if(i==6) {
				return;
			}
			
			System.out.println(i);  // 1 2 3 4 5 
			
		}
		
		for(int i=1;i<=10;i++) {  //6
			
			System.out.println(i);  // 1 2 3 4 5 ....10
			
		}
		
	}


}
