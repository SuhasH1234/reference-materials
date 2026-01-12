package Core;

class SuhasException extends Exception{	//creating own exception using parent exception
	public SuhasException(String string) {	//parent exception can be extends Exception or RuntimeException
		super(string);
	}
}
public class ExceptionHandlingExample3 {

	public static void main(String[] args) {
		int i=20;	
		int j=0;
		
		try {
			j=18/i;
			if(j==0) {
				throw new SuhasException("Own Exception is called");	//calling own exception
			}
		}
		catch(SuhasException e) {
			j=18/1;
			System.out.println("Default value" +e);
		}
		catch(Exception e) {	//default parent exception
			System.out.println("Something went wrong");
		}
		System.out.println(j);
		System.out.println("Suhas");

	}

}
