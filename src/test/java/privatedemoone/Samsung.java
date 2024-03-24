package privatedemoone;

public class Samsung {
	
	private int a = 10;
	public int b = 20;
	
	private void demoOne() {
		System.out.println("Inside demoOne method");
	}
	
	public void demoTwo() {
		System.out.println("Inside demoTwo method");
		demoOne();
		System.out.println(a);
	}

}

class SamsungA{
	
	public void sampleAMethod() {
		
		Samsung s = new Samsung();
		System.out.println(s.b);
		s.demoTwo();
	}
	
}
