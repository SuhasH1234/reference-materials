package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {

	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<Integer>();
		nums.add(22);
		nums.add(12);
		nums.add(99);
		
		Collections.sort(nums);	//Using collections class sort method
		System.out.println(nums);
	}

}
