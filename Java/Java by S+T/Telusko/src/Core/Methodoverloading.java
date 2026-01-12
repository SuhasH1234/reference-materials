package Core;

//Method overloading: Same method name but with different parameters eg: add() add()
class Calculator1 {
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public double add(double n1, double n2) {
		return n1+n2;
	}
}

public class Methodoverloading {
	public static void main(String a[]) {
		Calculator1 cal= new Calculator1();
		int res=cal.add(1, 2);
		System.out.println(res);
		double res1=cal.add(2.0, 4.1);
		System.out.println(res1);
	}
}
