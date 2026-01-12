package Core;

@FunctionalInterface
interface Dog{	//eg:1
	void run();
}

@FunctionalInterface
interface Dog1{	//eg:2
	void run1(int i);
}

@FunctionalInterface
interface Dog2{	//eg:3
	int add(int num1, int num2);
}

public class LamdaExpressionExample {	//works only with functional interface

	public static void main(String[] args) {
		//eg:1
		Dog obj = () -> {	//Functional Interface with Lambda Exp.
			System.out.println("Bark");
		};
		obj.run();
		
		//eg:2
		Dog1 obj1 = (int i) -> {	//Functional Interface with Lambda Exp.
			System.out.println("Bark1:" +i);
		};
		obj1.run1(2);
		
		//eg:3
		Dog2 obj2 = (int num1, int num2) -> { //Dog2 obj2 = (num1, num2) -> num1+num2;
			return num1+num2;
		};
		int res= obj2.add(10, 10);
		System.out.println(res);
	}

}
