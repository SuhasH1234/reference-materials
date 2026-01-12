package Core;

enum Status{
	Running, Failed, Pending, Success;
}

public class EnumExample {

	public static void main(String[] args) {
//		Status obj= Status.Running;	//eg: 1
//		System.out.println(obj);
		
//		Status[] obj= Status.values();	//eg:2
//		for (Status s: obj) {
//			System.out.println(s);
//		}
		
//		for (Status s: obj) {	//eg:3
//			System.out.println(s+ ": " +s.ordinal());
//		}
		
		Status obj= Status.Failed;	//eg:4 using if else
		if(obj == Status.Running) {
			System.out.println("Running");
		}
		else if(obj == Status.Failed) {
			System.out.println("Failed");
		}
		else if(obj == Status.Pending) {
			System.out.println("Pending");
		}
		else {
			System.out.println("Success");
		}
		
		switch(obj) {	//eg:5 using switch case
		case Running: 
			System.out.println("Running");
			break;
		case Failed: 
			System.out.println("Failed");
			break;
		case Pending: 
			System.out.println("Pending");
			break;
		default: 
			System.out.println("Success");
			break;
		}
	}

}
