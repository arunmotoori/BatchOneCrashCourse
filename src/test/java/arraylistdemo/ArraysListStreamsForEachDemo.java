package arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArraysListStreamsForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.addAll(List.of(9,5,7,6,1,4,3,2));
		list.stream().forEach(ele->System.out.println(ele));
		
	}

}
