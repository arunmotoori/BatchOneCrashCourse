package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FileCreateNewFileWrongFolderPathDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("ABC\\xyz.txt");
		
		file1.createNewFile();
		
		System.out.println("End of this program.");
		System.out.println("End of this program.");
		System.out.println("End of this program.");
		System.out.println("End of this program.");

	}

}
