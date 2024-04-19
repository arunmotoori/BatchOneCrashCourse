package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamImageDemo {

	public static void main(String[] args) throws IOException {
		
		File imgFile = new File("Arun2.png");
		File destImgFile = new File("Motoori2.png");
		
		FileInputStream fis = new FileInputStream(imgFile);
		FileOutputStream fos = new FileOutputStream(destImgFile);
		
		int num = fis.read();
		
		System.out.println(num);
		
		while(num!=-1) {
			
			fos.write(num);
			
			num = fis.read();
			
		}
		
		fis.close();
		fos.close();
		
		System.out.println("End of this program.");
	}

}
