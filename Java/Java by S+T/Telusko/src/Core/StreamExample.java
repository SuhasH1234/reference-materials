package Core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(12,2,43,56);
		
		//eg:A
		Stream<Integer> s1= nums.stream();	//eg;1used to perform operations which affecting nums and once used cannot be changed
		
		Stream<Integer> s2= s1.filter(n -> n%2==0);	//eg:2	filter
		
		Stream<Integer> s3= s2.map(n -> n*2);	//eg:2	map
		
		int res= s3.reduce(0, (c,e) -> c+e);	//eg:3	reduce
		
//		s1.forEach(n -> System.out.println(n));	//eg:1
//		s2.forEach(n -> System.out.println(n));	//eg:2
		System.out.println(res);	//eg:3
		
		//eg:B
		int res1= nums.stream()
					.filter(n -> n%2==0)	//uses predicate
					.map(n -> n*2)	//uses function
					.reduce(0,(c,e) -> c+e);
		System.out.println(res1);
	}

}
