package stringhandling;

public class StartsWithDemo {

	public static void main(String[] args) {
		
		String str = "My name is Arun Motoori";
		
		boolean b = str.startsWith("My");
		
		System.out.println(b);
		
		boolean c = str.startsWith("name");
		
		System.out.println(c);

	}

}
