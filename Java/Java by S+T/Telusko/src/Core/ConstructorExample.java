package Core;

class Human {
	private int age;
	private String name;
	
	public Human() {	//default Constructor
		age=12;
		name="Preethu";
	}

	public Human(int age, String name) { 	//parameterized Constructor
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Human obj= new Human();	//default with no parameters
		Human obj1= new Human(22, "Suhas");	//default with parameters
		System.out.println(obj.getName()+ ":" +obj.getAge());
		System.out.println(obj1.getName()+ ":" +obj1.getAge());
	}

}
