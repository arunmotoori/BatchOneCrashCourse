package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File fileX = new File("Kiran","digital.txt");
		
		if(!fileX.exists()) {
			fileX.createNewFile();
		}
		
		FileWriter fw = new FileWriter(fileX);
		fw.write("Today is Tuesday.\n");
		fw.write("Its a weekday.\n");
		fw.write("We are currently in Selenium Java Crash Course.\n");
		fw.write("This is 4th part of File Handling mechanism.");
		fw.flush();
		fw.close();
		
		//How to read the text from the file using FileReader
		FileReader fr = new FileReader(fileX);
		
		int num = fr.read();
		
		while(num!=-1) {
			
			System.out.print((char)num);
			num = fr.read();
			
		}
		
		fr.close();
		
	}

}
