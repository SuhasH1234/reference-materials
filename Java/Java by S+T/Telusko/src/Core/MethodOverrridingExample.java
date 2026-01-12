package Core;

class Electronics {	//same methodname as child with same parameters
	public int display(int n1, int n2) {
		return n1+n2;
	}
}

class SmartPhone extends Electronics {
	public int display(int n1, int n2) {
		return n1+n2+1;
	}
}

public class MethodOverrridingExample {
	public static void main(String args[]) {
		SmartPhone obj= new SmartPhone();
		System.out.println(obj.display(10, 2));
	}
}
