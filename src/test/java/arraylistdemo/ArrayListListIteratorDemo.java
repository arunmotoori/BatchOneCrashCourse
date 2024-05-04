package arraylistdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.addAll(List.of(9,5,7,1,4,8,3,2,6));
		
		ListIterator<Integer> litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

	}

}
