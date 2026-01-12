package Core;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		int i=0;
		int j=10;
		
		try {
			int res=j/i;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Something went wrong: " +e);
		}
		
		System.out.println("Hi");

	}

}
