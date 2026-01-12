package Core;

public class Array {
	public static void main(String a[]) {
		int num[]= {1,2,3};
		System.out.println(num[1]);
		
		int num1[] = new int[4];
		num1[0]=10;
		num1[1]=11;
		num1[2]=12;
		num1[3]=13;
		//multiple print statements
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		System.out.println(num1[3]);

		int num2[]=new int[4];
		num2[0]=100;
		num2[1]=110;
		num2[2]=120;
		num2[3]=130;
		//using loop only one print statement
		for(int i=0;i<=3;i++) {
			System.out.println(num2[i]);
		}
		
	}
}
