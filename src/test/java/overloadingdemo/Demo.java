package overloadingdemo;

public class Demo {

	public static void main(String[] args) {
		
		SampleThree st = new SampleThree();
		
		st.add(2,5);
		st.add(2,3,4);
		st.add(2,3,4,5);
		st.add(2,3.0);
		st.add(2,6);

	}

}
