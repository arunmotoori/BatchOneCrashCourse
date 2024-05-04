package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

//ArrayList - Preserves the order of elements in which they are added - Indexing
//ArrayList - Duplicate elements are allowed - Indexing
//for,for each,iterator()/Iterator,ListIterator/listIterator(),forEach(lambdaexpression),forEachRemaining(LambdaExpression),streamsForEach
//Initial capacity for ArrayList is 10 on creation and capacity increased by 50%+1 after completing 10
//Any other way to iterate ArrayList - https://chat.openai.com/c/5bffe175-fb68-4331-90fb-596e006cb1bf
//ArrayList and different Object types
//Predefined methods of ArrayList

public class ArrayListPropertiesDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9); // 0
		list.add(9); // 1
		list.add(5); // 2
		list.add(9); // 3
		list.add(9); // 4
		list.add(0); // 5
		list.add(6); // 6
		
		for(Integer i : list)
			System.out.println(i);
	}

}
