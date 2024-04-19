package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("zen.txt");
		
		FileInputStream fis =new FileInputStream(f1);
		
		int an = fis.read();
		
		while(an!=-1) {
			
			System.out.print((char)an);
			
			an = fis.read();
			
		}
		
		fis.close();

	}

}
