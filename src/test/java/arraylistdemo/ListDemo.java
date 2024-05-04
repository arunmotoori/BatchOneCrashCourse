package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(3);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		

	}

}
