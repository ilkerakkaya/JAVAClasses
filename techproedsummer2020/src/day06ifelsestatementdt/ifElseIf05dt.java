package day06ifelsestatementdt;

import java.util.Scanner;

public class ifElseIf05dt {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement,
If age is less than 13 output will be “Should not work”,
If age is greater than 65 output will be “Retired”,
Otherwise; output will be “Should work”
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("type the age");
		
		int age=scan.nextInt();
		
		if(age<13) {
			System.out.println("u should not work");
			
		}else if(age >65) {
			System.out.println("u must be retired");
		}else {
			System.out.println("pls work");
	scan.close();
		}
	}
	

}
