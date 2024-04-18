package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoTwo {

	public static void main(String[] args) throws IOException {
		
		File fileK = new File("Kiran","digital.txt");
		
		FileReader fr = new FileReader(fileK);
		
		int num = fr.read();
		
		System.out.println(num);
		
		while(num!=-1) {
			
			char c = (char)num;
			System.out.print(c);
			num = fr.read();
			
		}
		
		fr.close();

	}

}
