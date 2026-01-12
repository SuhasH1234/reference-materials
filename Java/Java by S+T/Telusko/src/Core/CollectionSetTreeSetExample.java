package Core;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetTreeSetExample {

	public static void main(String[] args) {
//		Set<Integer> nums= new TreeSet<Integer>();	//printing in sorted order, we can use set or collection
		Collection<Integer> nums= new TreeSet<Integer>();
		nums.add(52);
		nums.add(12);
		nums.add(32);
		
		for(int n:nums) {
			System.out.println(n);
		}
	}

}
