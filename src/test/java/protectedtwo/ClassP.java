package protectedtwo;

import protectedone.ClassM;

public class ClassP extends ClassM {
	
	public void sampleP() {
		
		System.out.println(a);
		sampleA();
		
	}
	
	public static void main(String[] args) {
		
		ClassP cp = new ClassP();
		cp.sampleP();
		
	}

}
