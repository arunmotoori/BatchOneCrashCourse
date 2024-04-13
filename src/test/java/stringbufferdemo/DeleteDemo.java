package stringbufferdemo;

public class DeleteDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Arun");
		System.out.println(sb);
		sb.delete(0,2);
		System.out.println(sb);
		
	}

}
