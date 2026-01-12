package Core;

class A2{
	public void start1() {
		System.out.println("A");
	}
}

class B2 extends A2{
	public void start2() {
		System.out.println("B");
	}
}
public class DownCastingExample {

	public static void main(String[] args) {
		A2 obj= (A2) new B2();	// upcasting
		obj.start1();
		
		B2 obj1= (B2) obj;	// downcasting
		obj1.start2();
		

	}

}
