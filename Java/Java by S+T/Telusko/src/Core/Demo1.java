package Core;

class Computer {
	public void Hello() {
		System.out.println("Hello");
	}
	public String getPen(int cost) {
		if (cost >= 10) {
			return "Good pen";
		}
		else {
			return "Bad pen";
		}
	}
}
public class Demo1 {
	public static void main(String args[]) {
		Computer com=new Computer();
		com.Hello();
		String res = com.getPen(20);
		System.out.println(res);
	}
}
