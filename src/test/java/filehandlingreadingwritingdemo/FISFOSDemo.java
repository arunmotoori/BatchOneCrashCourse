package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISFOSDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("sample1.txt");
		
		FileOutputStream fos = new FileOutputStream(f1);
		
		String str = "I have a pen and notebook.\nThese are gifted by my friend.\nI love these items.";
		
		fos.write(str.getBytes());
		
		fos.close();
		
		System.out.println("End of this program.");

	}

}
