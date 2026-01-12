package Core;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapExample {

	public static void main(String[] args) {	//map is a combination of list and set
		Map<String, Integer> students= new HashMap<>();	//assign key and values to map.
		students.put("Suhas", 23);
		students.put("Preethu", 53);
		students.put("HSSP", 30);
		
		System.out.println(students);
		System.out.println(students.get("Suhas"));	//get individual student values
		System.out.println(students.keySet());	//get key values
	}

}
