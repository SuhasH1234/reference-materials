package Core;

class A1{
	public void start1() {
		System.out.println("A");
	}
}

class B1 extends A1{
	public void start2() {
		System.out.println("B");
	}
}
public class UpCastingExample {

	public static void main(String[] args) {
		A1 obj=(A1) new B1();	//using Dynamic method dispatch and typecasting => upcasting
		obj.start1();
	}

}
