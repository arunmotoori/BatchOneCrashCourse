package stringhandling;

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "I love Java Programming and Java is an easy language.";
		
		String searchString = "Java";
		
		if(str.indexOf(searchString,8,32)!=-1) {
			System.out.println("Search string found");
		}else {
			System.out.println("Search string not found");
		}
			
		/*
		int i = str.indexOf("Java");
		System.out.println(i);
		
		int j = str.indexOf("Python");
		System.out.println(j);
		*/
		
		/*
		int i = str.indexOf('v');
		System.out.println(i);
		
		int j = str.indexOf("Java");
		System.out.println(j);
		
		int k = str.indexOf('v',5);
		System.out.println(k);
		
		int l = str.indexOf("Java",12);
		System.out.println(l);
		
		int m = str.indexOf('v',10,35);
		System.out.println(m);
		
		int n = str.indexOf("Java",20,40);
		System.out.println(n);*/

	}

}
