package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("zen.txt");
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		//Writing text into the file using FileWriter
		
		FileWriter fw = new FileWriter(file1);
		
		fw.write("My name is Ashish.\nI love Java programming.\nI am into Software Testing field.");
		fw.write("\nI stay in Hyderbad.");
		fw.flush();
		
		System.out.println("End of this program.");
		fw.close();

	}

}
