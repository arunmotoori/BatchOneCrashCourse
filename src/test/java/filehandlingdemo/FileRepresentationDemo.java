package filehandlingdemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileRepresentationDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\Users\\arunm\\Downloads\\ABC\\Arun.txt");  // Represent file in Java
		
		boolean b = file1.exists();
		
		System.out.println(b);
		
		if(b) {
			System.out.println("File1 exists at the given path");
		}else {
			System.out.println("File1 doesn't exists at the given path");
		}
		
		File file2 = new File("C:\\Users\\arunm\\Downloads\\ABC\\Motoori.txt");
	
		boolean c = file2.exists();
		
		System.out.println(c);
		
		if(c) {
			System.out.println("File2 exists at the given path");
		}else {
			System.out.println("File2 doesn't exists at the given path");
		}
		
		File file3 = new File("Rakesh.txt");
		
		String path1 = file3.getAbsolutePath();
		System.out.println(path1);
		String path2 = file3.getCanonicalPath();
		System.out.println(path2);
		String path3 = file3.getPath();
		System.out.println(path3);
		
		if(file3.exists()) {
			System.out.println("File3 exists at the given path");
		}else {
			System.out.println("File3 doesn't exists at the given path");
		}
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		File file4 = new File(System.getProperty("user.dir")+"\\Rakesh.txt");
	
		if(file4.exists()) {
			System.out.println("File4 exists at the given path");
		}else {
			System.out.println("File4 doesn't exists at the given path");
		}
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		String javaHomePath = System.getProperty("java.home");
		System.out.println(javaHomePath);
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		System.out.println("Arun");
		System.err.println("Motoori");
		
		PrintStream ps = System.out;
		ps.println("Arun");
	

	}

}
