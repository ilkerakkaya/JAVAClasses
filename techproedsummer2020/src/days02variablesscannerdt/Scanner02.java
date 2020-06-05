package days02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// get to integers from user
		//print their sum
		
		
		//1.Step
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter integrs");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("the Sum is " + (num1+num2));
		System.out.println("the product: " + (num1*num2));
		System.out.println("the division is " + (num1/num2));
		
		scan.close();
		
		
	}

}
