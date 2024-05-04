package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListForEachReamaningDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(1);
		list.add(8);
		list.add(4);
		
		Iterator<Integer> itr = list.iterator();
		itr.forEachRemaining(ele->System.out.println(ele));
	
	}

}
