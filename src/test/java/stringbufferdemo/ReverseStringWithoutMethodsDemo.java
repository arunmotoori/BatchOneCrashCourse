package stringbufferdemo;

public class ReverseStringWithoutMethodsDemo {

	public static void main(String[] args) {
		
		String str = "Arun";
		
		String word = "";
		  for (int i = 0; i < str.length(); i++) {
		   char c = str.charAt(i);
		   word = c + word;
		  }
		  System.out.println(word);
		 }
		
		/*
		char[] ar = str.toCharArray();
		
		for(int i=ar.length-1;i>=0;i--) {
			
			System.out.print(ar[i]);
			
		}*/

	}


