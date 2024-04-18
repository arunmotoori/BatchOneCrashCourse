package filehandlingdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingIsFileDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("Kumari","Jahnavi.txt");
		//File file1 = new File("Anil");
		
		if(file1.isFile()) {
			
			FileWriter fw = new FileWriter(file1);
			fw.write("My name is Arun Motoori.");
			fw.flush();
			System.out.println("Its a file. Text got written into file.");
			
		}else if(file1.isDirectory()){
			
			System.out.println("Its a folder. Hence not written anything");
			file1.delete();
			System.out.println("Folder got deleted");
		}
		
		System.out.println("End of this program");

	}

}
