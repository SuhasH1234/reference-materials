package DemoSpring_01.DemoSpring_01;

public class Dev {
	
	private int age;
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public int getAge() {	//setter injection
		return age;
	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}

	public Dev(int age) {	//constructor injection
		super();
		this.age = age;
		System.out.println("Constructor injection");
	}

	public Dev() {
		System.out.println("In Dev");
	}
	
	public void build() {
		System.out.println("In Dev Spring");
	}
}	
