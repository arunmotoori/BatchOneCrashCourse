package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FileCreateNewFileMethodDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("Nigora.txt");
		
		if(file1.exists()) {
			System.out.println("File already exists. Hence not creating again.");
		}else {
			//boolean b = file1.createNewFile();
			file1.createNewFile();
			System.out.println("File got created");
			
			/*
			if(b) {
				System.out.println("File got created");
			}else {
				System.out.println("File didn't get created");
			}*/
		}
		
		System.out.println("End of this program.");

	}

}
