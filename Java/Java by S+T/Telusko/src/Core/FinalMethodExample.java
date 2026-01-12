package Core;

class electronics{
	public void show() {
		System.out.println("Electronics");
	}
	
	public final int add(int n1, int n2) {	//final used
		return n1+n2;
	}
}

class Computer3 extends electronics{
	public void show() {
		System.out.println("Computer");
	}
	
	public int add1(int n1, int n2) {
		return n1+n2+1;
	}
}
public class FinalMethodExample {
	public static void main(String args[]) {
		Computer3 obj= new Computer3();
		obj.show();
		System.out.println(obj.add(10, 10));	//final
		System.out.println(obj.add1(10, 10));	//without final
	}
}
