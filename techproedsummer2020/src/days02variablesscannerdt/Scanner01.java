package days02variablesscannerdt;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//Scanner class is used to get data from users
		// to get dat from user there r 3 steps
		
		
		//1.Step
		
		Scanner scan= new Scanner(System.in);
		
		//2.step
		
		System.out.println("pls give integer");
		
		//3.Step
		
		int num = scan.nextInt();
		
		System.out.println(num);
		
		scan.close();
	}

}
