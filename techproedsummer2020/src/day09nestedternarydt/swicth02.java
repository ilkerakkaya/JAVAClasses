package day09nestedternarydt;

import java.util.Scanner;

public class swicth02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter letter
		 If the letter is 'A' print on the console "First letter"
		 If the letter is 'B' print on the console "Second letter"
		 If the letter is 'C' print on the console "Third letter"
		 If the letter is 'D' print on the console "Fourth letter"
		 Otherwise print on the console "What kind of letter is this?"
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("\"Write ur Letter\"");
		char letter=scan.next().charAt(0);
		
		switch(letter) {
		case A:
			System.out.println("First letter");
			break;
		case B:
			System.out.println("Second letter");
			break;
		case C:
			System.out.println("Third letter");
	        break;
		case D:
			System.out.println("Fourth letter");
	        break;    
	        
	    default:
	    	System.out.println("What kind of letter is this?");
	}

}
