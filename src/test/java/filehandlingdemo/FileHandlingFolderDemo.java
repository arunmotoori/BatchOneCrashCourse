package filehandlingdemo;

import java.io.File;

public class FileHandlingFolderDemo {

	public static void main(String[] args) {
		
		File folder1 = new File("Motoori");
		
		if(folder1.exists()) {
			System.out.println("Folder already exists. Hence not created again");
		}else {
			
			if(folder1.mkdir()) {
				System.out.println("Folder got created");
			}
			
		}
		
		/*
		boolean b = folder1.mkdir();
		
		if(b) {
			System.out.println("Folder got created");
		}else {
			System.out.println("Folder is not created");
		}*/
		
		System.out.println("End of this program");

	}

}
