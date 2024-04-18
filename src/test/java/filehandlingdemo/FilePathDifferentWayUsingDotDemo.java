package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FilePathDifferentWayUsingDotDemo {

	public static void main(String[] args) throws IOException {

		File file1 = new File("./Anil.txt");

		System.out.println(file1.getCanonicalPath());
		// System.out.println(file1.getPath());
		// System.out.println(file1.getAbsolutePath());

		file1.createNewFile();

		System.out.println("End of this program.");

		// Ctrl+Shift+F

	}

}
