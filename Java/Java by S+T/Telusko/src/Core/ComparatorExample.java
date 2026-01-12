package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {	//used to create own logic to sort use Comparator

	public static void main(String[] args) {
		Comparator<Integer> com= new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10 > j%10) {
					return 1;	//returns in sort order
				}
				else {
					return -1;	//does not returns in sort order
				}
			}
		};
		List<Integer> nums= new ArrayList<Integer>();
		nums.add(43);	//or we can use List<Integer> nums= Arrays.asList(43,31,72);
		nums.add(31);
		nums.add(72);
		
		Collections.sort(nums, com);	//adding comparator
		System.out.println(nums);

	}

}
