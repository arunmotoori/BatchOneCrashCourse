package stringbufferdemo;

public class DeleteCharAtMethod {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("QAFox");
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
	}

}
