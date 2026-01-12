package Core;

class Mobile {
	String brand; 	//instance variable
	int price;
	static String name;  //static variable
	
	public void show() {
		System.out.println(brand+ ":" +price+ ":" +name);
	}
}
public class StaticExample {
	public static void main(String args[]) {
		Mobile obj1= new Mobile();
		obj1.brand="Apple";
		obj1.price=1000;
		Mobile.name="Suhas"; 	//static word should be called using classname
		
		Mobile obj2= new Mobile();
		obj2.brand="Oppo";
		obj2.price=1200;
		Mobile.name="Preethu";
		
		Mobile.name="Hello"; 	// using static we can change all names to new one referring those objects
		obj1.show();
		obj2.show();
	}
	
}
