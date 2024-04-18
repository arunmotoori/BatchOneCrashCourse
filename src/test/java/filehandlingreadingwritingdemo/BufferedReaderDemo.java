package filehandlingreadingwritingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("Goa","beach.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = br.readLine(); 
		}
		
		br.close();
		
		/*
		String line1 = br.readLine();
		String line2 = br.readLine();
		String line3 = br.readLine();
		String line4 = br.readLine();
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println(line4);
		*/
		

	}

}
