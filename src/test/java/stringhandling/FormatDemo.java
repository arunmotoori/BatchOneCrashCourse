package stringhandling;

public class FormatDemo {

	public static void main(String[] args) {
		String name = "Arun Motoori";
		int experience = 17;
		String s = String.format("My name is %s and I have %d years of experience.",name,experience);
		System.out.println(s);
	}

}
