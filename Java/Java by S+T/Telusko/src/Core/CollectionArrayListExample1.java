package Core;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayListExample1 {

	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<Integer>();	//to get index values use List instead of collections
		nums.add(2);
		nums.add(5);
		nums.add(3);

		System.out.println(nums.get(2));	//getting index values
		System.out.println(nums.indexOf(5));	//getting number assigned to index values
	}

}
