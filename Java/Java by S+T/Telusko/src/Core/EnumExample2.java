package Core;

enum Animalss{
	Dog(5000), Cat, Cow(25000);
	
	private Animalss() {	//using default constructor the price can be changed
		price=1000;
	}

	private int price;

	private Animalss(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}
}
public class EnumExample2 {

	public static void main(String[] args) {
//		Animals obj= Animals.Cat;	//eg:1
//		System.out.println(obj);

		Animalss[] obj= Animalss.values();	//eg:2
		for(Animalss s: obj) {
			System.out.println(s+ ":" +s.getPrice());
		}
	}

}
