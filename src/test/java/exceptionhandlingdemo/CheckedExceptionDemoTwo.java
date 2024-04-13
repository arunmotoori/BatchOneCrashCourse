package exceptionhandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemoTwo {

	public static void main(String[] args)   {
		
		File file1 = new File("abc.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException got handled here");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
