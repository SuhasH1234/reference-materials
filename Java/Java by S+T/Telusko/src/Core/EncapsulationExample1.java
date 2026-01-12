package Core;

class Mobile1 {
	private int mprice=100;
	private String mname="iPhone";
	
	public int getPrice() {
		return mprice;
	}
	
	public String getName() {
		return mname;
	}
}
public class EncapsulationExample1 {

	public static void main(String[] args) {
		Mobile1 obj= new Mobile1();
		System.out.println(obj.getName()+ ":" +obj.getPrice());
	}

}
