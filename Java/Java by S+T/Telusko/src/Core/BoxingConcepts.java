package Core;

public class BoxingConcepts {

	public static void main(String[] args) {
		int num= 10;
		Integer num1= new Integer(11);	// boxing
		
		Integer num2= num1;	// auto-boxing
		
		int num3= num2;	//auto-unboxing
		
		Integer num4= num1.intValue();	//unboxing
		
		System.out.println("boxing :" +num1);
		System.out.println("auto-boxing :" +num2);
		System.out.println("auto-unboxing :" +num3);
		System.out.println("unboxing :" +num4);
	}

}
