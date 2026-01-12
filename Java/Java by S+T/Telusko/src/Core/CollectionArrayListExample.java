package Core;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArrayListExample {

	public static void main(String[] args) {
		Collection<Integer> nums= new ArrayList<Integer>();	//using generics i.e <>
		nums.add(2);
		nums.add(3);
		nums.add(6);
		
		for(int n:nums) {	//enhance for loop
			System.out.println(n);
		}
	}

}
