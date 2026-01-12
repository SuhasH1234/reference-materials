package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyExample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try {
			System.out.println("Enter a number: ");
			InputStreamReader in= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(in);
			int num= Integer.parseInt(br.readLine());
			System.out.println(num);
		}
		finally {	// this will be executed irrespective of other block
			System.out.println("Finally");	//mainly used to close a resource
		}
	}

}
