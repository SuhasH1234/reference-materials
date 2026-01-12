package Core;

class T1 extends Thread{	//we can also set priority using min_priority,max_priority
	public void run() {	//run method
		for(int i=0;i<=50;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(10);	//sleep method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T2 extends Thread{
	public void run() {
		for(int i=0;i<=50;i++){
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		T1 obj1= new T1();
		T2 obj2= new T2();
		
		obj1.start();
		obj2.start();

	}

}
