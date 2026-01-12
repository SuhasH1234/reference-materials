package Core;

public class StringBufferExample {
	public static void main(String args[]) {
		StringBuffer sb= new StringBuffer("Suhas");
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		sb.append(" H");	// adding
		System.out.println(sb);
		
		sb.deleteCharAt(2);		//deleting
		System.out.println(sb);
		
		sb.insert(2, "h");		//inserting
		System.out.println(sb);
		
		sb.setLength(20); 		//length will be set to 20
		
		sb.ensureCapacity(5); 	//minimum capacity is set to 5
		
	}
}