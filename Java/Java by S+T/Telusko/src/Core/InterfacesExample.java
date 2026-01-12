package Core;

interface A4 {
	int age=18;	//interfaces are final and static
	String gender= "Male";
	
	void start();
	void run();
}

class B4 implements A4 {
	public void start() {
		System.out.println("In Start");
	}
	
	public void run() {
		System.out.println("In Run");
	}
}
public class InterfacesExample {

	public static void main(String[] args) {
		A4 obj= new B4();
		obj.start();
		obj.run();
		System.out.println(A4.gender);
		System.out.println(A4.age);
	}

}
