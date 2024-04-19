package filehandlingreadingwritingdemo;

public class IntegerToBytesDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<=255;i++) {
			
			System.out.println(i);
			
			String str = Integer.toBinaryString(i);
			System.out.println(str);
			
			int num = Integer.parseInt(str,2);
			System.out.println(num);
			
		}

	}

}
