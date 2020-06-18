package day15dowhilelooopdt;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "Long name"
		 otherwise print "Normal name" and finish the loop
		 */
		Scanner scan=new Scanner(System.in);
		String firstName = "";
		
		
		do {
			
			System.out.println("Enter ur first Name");
			firstName=scan.next();
			
			if(firstName.length()>6) {
				System.out.println("your name is too long");
			}
			
		}while(!(firstName.length()<=6));
		System.out.println("Normal name");
		
	
		
	}

}
