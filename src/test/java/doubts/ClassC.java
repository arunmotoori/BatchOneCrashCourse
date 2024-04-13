package doubts;

import java.util.Date;

public class ClassC {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		
		String s = date.toString().replace(" ","_").replace(":","_").concat(".png");
		System.out.println(s);
	}

}
