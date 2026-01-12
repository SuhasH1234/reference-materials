package Core;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(43,31,72);
		
//		for(int i=0;i<nums.size();i++) {	//eg: 1
//			System.out.println(nums.get(i));
//		}
		
//		for(int n:nums) {	//eg:2
//			System.out.println(n);
//		}
		
		nums.forEach(n -> System.out.println(n));	//eg:3

	}

}
