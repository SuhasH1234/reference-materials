package Core;

class Aa{
	public void display() {
		System.out.println("IN Display");
	}
	
//	class Bb{	//eg:1 inner class i.e class inside class
//		public void display1() {
//			System.out.println("IN Display 1");
//		}
//	}
	
	static class Bb{	//using static in inner class i.e class inside class only we can use static
		public void display1() {
			System.out.println("IN Display 1");
		}
	}
}
public class InnerClassExample {

	public static void main(String[] args) {
		Aa obj= new Aa();
		obj.display();
		
//		Aa.Bb obj1= obj.new Bb();	//eg: 1to create object=> outsideclass.innerclass obj= previous obj.new innerclass();
//		obj1.display1();
		// or
		
		Aa.Bb obj1= new Aa.Bb();	//1g:2 using static in innerclass only this can be done
		obj1.display1();

	}

}
