package stringhandling;

import java.nio.charset.StandardCharsets;

public class GetBytesDemo {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		byte[] br = str.getBytes();
		
		for(byte b : br) {
			System.out.print(b);
		}

	}

}
