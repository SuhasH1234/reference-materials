package Core;

class Appa{	//parent
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
		return n1-n2;
	}
}

class Suhas extends Appa{	//child of Appa parent
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	public int div(int n1, int n2) {
		return n1/n2;
	}
}

class Preetham extends Suhas{	//child of Suhas parent
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
}

public class InheritanceExample {
	public static void main(String args[]) {
		Appa obj= new Appa();
		Suhas obj1= new Suhas();
		Preetham obj2= new Preetham();
		System.out.println(obj.add(12,10));
		System.out.println(obj1.mul(12,10));
		System.out.println(obj2.power(12,10));
	}
}
