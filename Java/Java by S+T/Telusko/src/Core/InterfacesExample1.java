package Core;

interface A5 {
	void start();
	void run();
}

interface C5{
	void display();
}

interface D5 extends C5{	//interface to interface use extends
	void shoot();
}

class B5 implements A5,C5,D5 {
	public void start() {
		System.out.println("In Start");
	}
	
	public void run() {
		System.out.println("In Run");
	}
	
	public void display() {
		System.out.println("In Display");
	}
	
	public void shoot() {
		System.out.println("In Shoot");
	}
}

public class InterfacesExample1 {

	public static void main(String[] args) {
		A5 obj= new B5();
		obj.start();
		obj.run();
		
		C5 obj1= new B5();
		obj1.display();
		
		D5 obj2= new B5();
		obj2.shoot();
	}

}
