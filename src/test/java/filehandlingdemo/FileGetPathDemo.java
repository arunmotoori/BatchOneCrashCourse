package filehandlingdemo;

import java.io.File;

public class FileGetPathDemo {

	public static void main(String[] args) {
		
		File file1 = new File("Rakesh.txt");
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getPath());
		
		File file2 = new File("Kumari\\Jahnavi.txt");
		
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());

	}

}
