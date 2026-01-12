package Core;

class T111 implements Runnable{	//using lambda expression which supports functional interface concept to create threads
	
}

class T222 implements Runnable{
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
public class ThreadExample2 {

	public static void main(String[] args) {
		Runnable obj1= () ->	//lambda expression
				{
					for(int i=0;i<=5;i++){
						System.out.println("Hi");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
		Runnable obj2= () ->	//lambda expression
			{
				for(int i=0;i<=5;i++){
					System.out.println("Hello");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
		t1.start();
		t2.start();

	}

}
