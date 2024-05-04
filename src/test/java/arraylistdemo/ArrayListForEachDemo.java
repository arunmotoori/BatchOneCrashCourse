package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(4);
		
		//list.forEach(ArrayListForEachDemo::iterateElements);
		//list.forEach((ele)->{System.out.println(ele);});
		list.forEach(ele->System.out.println(ele));
		
	}
	
	/*
	public static void iterateElements(Integer ele) {
		
		System.out.println(ele);
		
	}*/
	
	

}
