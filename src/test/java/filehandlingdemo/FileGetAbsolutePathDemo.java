package filehandlingdemo;

import java.io.File;

public class FileGetAbsolutePathDemo {

	public static void main(String[] args) {
		
		File file1 = new File("Rakesh.txt");
		
		if(file1.exists()) 
		   System.out.println(file1.getAbsolutePath());
		
		File file2 = new File("Orange.txt");
		
		if(file2.exists()) 
			System.out.println(file2.getAbsolutePath());
	        System.out.println("End of this program.");
		
	}

}
