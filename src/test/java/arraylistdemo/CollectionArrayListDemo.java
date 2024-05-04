package arraylistdemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayListDemo {

	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<>();
		
		collection.add(9);
		collection.add(5);
		collection.add(7);
		collection.add(8);
		collection.add(1);
		collection.add(3);
		
		for(Integer i : collection) {
			System.out.println(i);
		}

	}

}
