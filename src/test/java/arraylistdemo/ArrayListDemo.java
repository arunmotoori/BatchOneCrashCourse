package arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*
		int[] ar = {9,5,7,1,8,2,3,4,6};
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(Arrays.stream(ar).boxed().toArray(Integer[]::new)));
		System.out.println(alist);
		*/
		
		/*
		int[] ar = {9,5,7,1,8,2,3,4,6};
		Integer[] iar = Arrays.stream(ar).boxed().toArray(Integer[]::new);
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(iar));
		System.out.println(alist);
		*/
		
		/*
		ArrayList<Integer> alist = new ArrayList<>(List.of(9,5,7,1,8,2,3,4,6));
		System.out.println(alist);
		*/
		
		/*
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(9,5,7,1,8,2,3,6,4));
		System.out.println(alist);
		*/
		
		
		/*
		 
		 * ArrayList<Integer> alist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elments you want to store into ArrayList:");
		int size = scanner.nextInt();
		
		for(int i=1;i<=size;i++) {
			
			System.out.println("Enter Element"+i+":");
			alist.add(scanner.nextInt());
			
		}
		
		System.out.println(alist);
		
		scanner.close();
		
		*/
		
		/*
		alist.add(9); // 0
		alist.add(5); // 1
		alist.add(7); // 2
		alist.add(1); // 3
		alist.add(8); // 4
		alist.add(2); // 5
		alist.add(3); // 6
		alist.add(0); // 7
		alist.add(4); // 8
		alist.add(6); // 9
	
		for(Integer e : alist)
			System.out.println(e);
		
		*/
		
		/*
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		*/
			
		/*
		System.out.println(alist.get(0)); // 9
		System.out.println(alist.get(1)); // 5
		System.out.println(alist.get(2)); // 7
		System.out.println(alist.get(3)); // 1
		System.out.println(alist.get(4)); // 8
		System.out.println(alist.get(5)); // 2
		System.out.println(alist.get(6)); // 3
		System.out.println(alist.get(7)); // 0
		System.out.println(alist.get(8)); // 4
		*/
		
	}

}
