package Core;

class Human3 {
	public void show() {
		System.out.println("Hello");
	}
}

public class ObjectCreationExample {
	public static void main(String args[]) {
		Human3 obj= new Human3();
		obj.show();
		//or
		new Human3().show();
	}
}
