package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingInputFromUserExample {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number: ");
		
//		InputStreamReader in= new InputStreamReader(System.in);	//eg:1
//		BufferedReader bf= new BufferedReader(in);
//		int res= Integer.parseInt(bf.readLine());
//		System.out.println(res);
//		br.close();
		
		Scanner sc= new Scanner(System.in);	//eg:2
		int res= sc.nextInt();
		System.out.println(res);
	}

}
