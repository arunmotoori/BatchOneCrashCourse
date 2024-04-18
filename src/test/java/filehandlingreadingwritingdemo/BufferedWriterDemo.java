package filehandlingreadingwritingdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("Goa","beach.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write("I went to Goa.");
		bw.newLine();
		bw.write("Goa contains lots of beaches.");
		bw.newLine();
		bw.write("We have booked a hotel where we had an access to a private beach.");
		bw.flush();
		bw.close();
		System.out.println("End of this program");
		

	}

}
