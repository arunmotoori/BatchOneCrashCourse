package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FileCanonicalPathDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:/QAFox\\BatchOneCrashCourse/CrashJavaCourseProject/Rakesh.txt");
		File file2 = new File("C:/QAFox/Arun/../BatchOneCrashCourse/CrashJavaCourseProject/Rakesh.txt");
		
		System.out.println(file1.getCanonicalPath());
        System.out.println(file2.getCanonicalPath());
		
		System.out.println("End of this program.");
	
	}

}
