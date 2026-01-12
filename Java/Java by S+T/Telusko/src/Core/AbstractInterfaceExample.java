package Core;

abstract class Computer1{	//using abstract
	public abstract void start();
}

class Laptop extends Computer1 {
	public void start() {
		System.out.println("In Laptop");
	}
}

class Desktop extends Computer1 {
	public void start() {
		System.out.println("In Desktop");
	}
}

class Developer {
	public void run(Computer1 lap) {
		lap.start();
	}
}

public class AbstractInterfaceExample {

	public static void main(String[] args) {
		Computer1 lap= new Laptop();
		Desktop desk= new Desktop();
		
		Developer dev= new Developer();
		dev.run(lap);

	}

}
