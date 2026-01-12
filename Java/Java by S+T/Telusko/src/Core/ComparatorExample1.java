package Core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}

	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}
public class ComparatorExample1 {

	public static void main(String[] args) {
		Comparator<Students> com= new Comparator<Students>() {
			public int compare(Students i, Students j) {
				if(i.age > j.age) {
					return 1;	//returns in sort order
				}
				else {
					return -1;	//does not returns in sort order
				}
			}
		};
		List<Students> studs= new ArrayList<Students>();
		studs.add(new Students(11, "Suhas"));
		studs.add(new Students(8, "Preethu"));
		studs.add(new Students(21, "HSSP"));
		
		Collections.sort(studs, com);	//adding comparator
		for(Students s: studs) {
			System.out.println(s);
		}
	}

}
