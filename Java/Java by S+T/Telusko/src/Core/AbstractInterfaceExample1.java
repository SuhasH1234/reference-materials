package Core;

interface Computer2{	//using abstract
	public abstract void start();
}

class Laptop2 implements Computer2 {
	public void start() {
		System.out.println("In Laptop");
	}
}

class Desktop2 implements Computer2 {
	public void start() {
		System.out.println("In Desktop");
	}
}

class Developer2 {
	public void run(Computer2 lap) {
		lap.start();
	}
}

public class AbstractInterfaceExample1 {

	public static void main(String[] args) {
		Computer2 lap= new Laptop2();
		Desktop2 desk= new Desktop2();
		
		Developer2 dev= new Developer2();
		dev.run(lap);

	}

}
