package javaprograms;

import java.util.HashSet;

public class RemoveDuplicateWordsFromStringText {

	public static void main(String[] args) {
		
		String str = "aa aa 22 cc aa 33 bb cc 123 456 11 bb aa";

        String words[] = str.split(" "); // Corrected spelling of 'split'

        HashSet<String> hs = new HashSet<>(); // Corrected generic type declaration

        for (String str1 : words) {
            hs.add(str1);
        }

        System.out.println(hs.toString());
	        
	}
	
}
		
		