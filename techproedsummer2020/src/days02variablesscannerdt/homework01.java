package days02variablesscannerdt;

import java.util.Scanner;

public class homework01 {

	public static void main(String[] args) {
		/*
		 2) Type a program which calculates the cube of a number which is entered by
		user.
			Hint 1: Cube of a number is a x a x a
		 */
		
	Scanner cube = new Scanner(System.in);
		
		System.out.println("Pls calculate cube ");
		
		double num01 = cube.nextDouble();
		
		System.out.println("the result is: " + num01*num01*num01 );
		
		cube.close();
		
		
		

	}

}
