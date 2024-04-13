package stringhandling;

public class ConcatDemo {

	public static void main(String[] args) {
		
		String firstName = "Arun";
		String lastName = "Motoori";
		String space = " ";
		int a = 9;
		int b = 1;
		
		String fullName = firstName+space+lastName;
		System.out.println(fullName);
		
		String fullName2 = firstName.concat(space).concat(lastName);
		System.out.println(fullName2);
		
		String fullName3 = "Arun"+" "+"Motoori";
		System.out.println(fullName3);
		
		System.out.println("Concatenation of "+firstName+" and "+lastName+" is:"+fullName);
		System.out.println("Concatenation of ".concat(firstName).concat(" and ").concat(lastName).concat(" is:").concat(fullName));
	
		System.out.println("My favourite number is "+a);
		System.out.println(a+b);
		
	
	}

	
}