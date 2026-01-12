package Core;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			if(j==0) {
				throw new ArithmeticException();	//calling exception
			}
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println("Default value");
		}
		catch(Exception e) {	//deafult parent exception
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Suhas");

	}

}
