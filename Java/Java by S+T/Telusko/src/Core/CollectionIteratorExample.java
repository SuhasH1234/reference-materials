package Core;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionIteratorExample {

	public static void main(String[] args) {
		Collection<Integer> nums= new TreeSet<Integer>();
		nums.add(52);
		nums.add(12);
		nums.add(32);
		
		Iterator<Integer> values= nums.iterator();	//we can sort values using iterator also
		while(values.hasNext()) {
			System.out.println(values.next());
		}

	}

}
