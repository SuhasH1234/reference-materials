package Core;

class AA{
	public void start() {
		System.out.println("in A");
	}
}
public class AnonymousExample {

	public static void main(String[] args) {
		AA obj= new AA() { // anonymous inner class
			public void start() {
				System.out.println("in new A");
			}
			
		};
		obj.start();
	}

}
