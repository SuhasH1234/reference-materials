package Core;

public class ArrayofObjects {
	String name;
	int marks;
	int id;

	public static void main(String a[]) {
		
		ArrayofObjects a1= new ArrayofObjects();
		a1.id=1;
		a1.name="Suhas";
		a1.marks=89;
		
		ArrayofObjects a2= new ArrayofObjects();
		a2.id=2;
		a2.name="Preethu";
		a2.marks=99;
		
		ArrayofObjects a3= new ArrayofObjects();
		a3.id=3;
		a3.name="Harish";
		a3.marks=97;
		
		ArrayofObjects student[]= new ArrayofObjects[3];
		student[0]=a1;
		student[1]=a2;
		student[2]=a3;
		
//		for(int i=0;i<student.length;i++) {
//			System.out.println(student[i].id+" " +student[i].name+ " " +student[i].marks);
//		}
//		 same output but in different ways....
		
		for(ArrayofObjects n: student) {	//enhance for loop
			System.out.println(n.id+" " +n.name+ " " +n.marks);
		}
	}
}