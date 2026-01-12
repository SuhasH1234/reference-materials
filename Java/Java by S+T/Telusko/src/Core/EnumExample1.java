package Core;

enum Animals{
	Dog(5000), Cat(2000), Cow(25000);
	
	private int price;

	private Animals(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}
}
public class EnumExample1 {

	public static void main(String[] args) {
//		Animals obj= Animals.Cat;	//eg:1
//		System.out.println(obj);

		Animals[] obj= Animals.values();	//eg:2
		for(Animals s: obj) {
			System.out.println(s+ ":" +s.getPrice());
		}
	}

}
