package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class CreatingFileUnderAFolderDemo {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("Motoori");
		File file1 = new File(folder1,"abc.txt");
		
		if(folder1.exists()) {
		
			if(!file1.exists()) {
				
				file1.createNewFile();
				System.out.println("File got created");
				
			}else {
				
				System.out.println("File already exists. Hence not created again");
				
			}
		
		}else {
			System.out.println("Folder doesn't exists. Hence file is not created.");
		}
		
		System.out.println("End of this program.");
		

	}

}
