package day15dowhilelooopdt;

import java.util.Scanner;

public class dowhile03 {

	public static void main(String[] args) {
		/*
		 // Ask user to enter a number
// If the number user entered is less than 10 print "Won!" on the console
// otherwise ask user to enter a number again.
		 */
	
		Scanner scan=new Scanner (System.in);
		
		
		int i = 1;
		
		do {
			System.out.println("Enter a number");
			i =scan.nextInt();
			
		}while(i>=10);
		
		System.out.println("U won");
		
		
		
		/*
		 
		 */
		
	}

}
