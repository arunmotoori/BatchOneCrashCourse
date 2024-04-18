package filehandlingreadingwritingdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f1 = new File("Katalon","kite.txt");
		
		PrintWriter pw = new PrintWriter(f1);
		
		pw.println("I love kites.");
		pw.println("We play with kites during kites festival.");
		pw.print("Different types of threads are used to cut the other kites during this festival.");
		//pw.flush();
	    // close = flush and close
		pw.close(); 
		
		System.out.println("End of this program.");
		
		
	}

}
