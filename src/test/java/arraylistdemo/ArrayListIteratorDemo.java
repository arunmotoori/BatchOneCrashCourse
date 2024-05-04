package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<>();
		
		list.add(9); // 0
		list.add(5); // 1
		list.add(7); // 2
		list.add(1);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(6);
		
		// iterator() - Collection interface
		
		 Iterator<Integer> itr = list.iterator();
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
			 
		 }
		//Its better to choose Iterator interface for iterating when there is a need to 
		//remove the elements safely from Collection Framework classes
		// In case for each loop and using remove method of ArrayList, may result in ConcurrentModificaitonException
		//
	
		/*
		for(Integer i : list) {
			System.out.println(i);
		}*/
		
		
		
	}

}
