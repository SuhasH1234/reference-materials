package Core;

class Mobile2 {
	private int mprice;
	private String mname;
	
	public void setPrice(int mprice) { //(int p) 
//		mprice=p; // or
		this.mprice=mprice;
	}
	
	public void setName(String mname) { //(String n)
//		mname=n;	// or
		this.mname=mname;
	}
	
	public int getPrice() {
		return mprice;
	}
	
	public String getName() {
		return mname;
	}
}
public class EncapsulationExample2 {

	public static void main(String[] args) {
		Mobile2 obj= new Mobile2();
		obj.setName("Iphone");
		obj.setPrice(1000);
		
		System.out.println(obj.getName()+ ":" +obj.getPrice());
	}

}
