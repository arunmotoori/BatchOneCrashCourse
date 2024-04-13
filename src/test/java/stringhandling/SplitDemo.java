package stringhandling;

public class SplitDemo {

	public static void main(String[] args) {
		
		String str = "Apple Bannana Orange Pineapple Grapes Guava";
		
		String[] ar = str.split(" ");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar[5]);
		
		String str2 = "My-name-is-Arun-Motoori";
		
		String[] ar2 = str2.split("-");
		
		for(String s : ar2) {
			System.out.println(s);
		}

	}

}
