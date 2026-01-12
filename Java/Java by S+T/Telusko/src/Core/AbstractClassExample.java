package Core;

abstract class Car {	//using abstract before classname
	public abstract void drive();	//when i dont know method to define and later i want to define=> use abstract
	
	public void music() {
		System.out.println("Music is playing");
	}
}

class BMW extends Car{	// concrete class
	public void drive() {
		System.out.println("Driving");
	}
}
public class AbstractClassExample {

	public static void main(String[] args) {
		Car obj= new BMW();	//dynamic method dispatch
		// or
//		BMW obj= new BMW();	// abstract class cannot create objects
		obj.drive();
		obj.music();
	}

}
