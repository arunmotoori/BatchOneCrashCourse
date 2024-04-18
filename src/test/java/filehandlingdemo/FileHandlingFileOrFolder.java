package filehandlingdemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingFileOrFolder {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file or folder details:");
		String f = scanner.next();
		scanner.close();
		File fa = new File(f);
		
		if(fa.mkdir() && !f.contains(".")) {
			if(fa.isDirectory())
				System.out.println("Its a folder and it got created.");
		}else if(fa.createNewFile()) {
			if(fa.isFile())
				System.out.println("Its a file and it got created.");
		}
		
		System.out.println("End of this program.");

	}

}
