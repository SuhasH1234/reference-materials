package Core;

class T11 implements Runnable{	//using interface concept to create threads
	public void run() {	//run method
		for(int i=0;i<=5;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(10);	//sleep method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T22 implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++){
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample1 {

	public static void main(String[] args) {
		Runnable obj1= new T11();
		Runnable obj2= new T22();
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
