package filehandlingdemo;

import java.io.File;

public class FileDeleteMethodDemo {

	public static void main(String[] args) {
		
		File file1 = new File("abc.txt");
		
		if(file1.exists()) {
			
			boolean b = file1.delete();
			if(b) {
				System.out.println("File got deleted successfully.");
			}
			
		}else {
			System.out.println("File doesn't exists. Hence not deleted.");
		}
		
		System.out.println("End of this program.");

	}

}
