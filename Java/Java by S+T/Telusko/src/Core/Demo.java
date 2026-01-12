package Core;

class Calculator {
	public int add(int n1, int n2) {
//		int res=n1+n2;
//		return res; or use any of these
		
		return n1+n2;
	}
	
}
public class Demo {
	public static void main(String args[]) {
		int num1=1;
		int num2=2;
		
		//creating an object
		Calculator calc = new Calculator();
		int res1 = calc.add(num1, num2);
		System.out.println(res1);
	}
}
