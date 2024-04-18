package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class CreatingFolderFileOutsideProjectDemo {

	public static void main(String[] args) throws IOException {
		
		File fd1 = new File("C:\\Users\\arunm\\Downloads\\Box");
		File f1 = new File(fd1,"snake.txt");
		
//		System.out.println(fd1.isDirectory()); // true
//		System.out.println(f1.isDirectory()); // false
//		
//		System.out.println(fd1.isFile()); // false
//		System.out.println(f1.isFile()); // true
		
		if(!fd1.exists()) 
		   fd1.mkdir();
		else
		   System.out.println("Folder already exists.Hence not created.");
		
		if(!f1.exists())
			f1.createNewFile();
		else
			System.out.println("File already exists. Hence not created.");
		
		System.out.println("End of this program.");

	}

}
