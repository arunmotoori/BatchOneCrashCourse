package stringhandling;

public class ToCharArrayDemo {

	public static void main(String[] args) {
		
		String str = "el4e9ph$3a#2nt";
		
		char[] cr = str.toCharArray();
		
		int sum = 0;
	
		for(char c : cr) {
			
			if(!(Character.isDigit(c) || Character.isLetter(c))) {
				System.out.println(c);  // '2'
				//String s = String.valueOf(c);  // "2"
				//sum = sum + Integer.parseInt(s); // 2
			}
			
		}
		
		//System.out.println(sum);
		
	}

}
