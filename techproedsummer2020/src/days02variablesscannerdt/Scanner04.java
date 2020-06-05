package days02variablesscannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle
         whose length and with are entered by user.
         Hint 1: Area of a rectangle is width x length
         Hint 2: Perimeter of a rectangle is 2x(width + length)
		 */

Scanner scan=new Scanner(System.in);
		
		System.out.println("enter width and length");
		
		double width= scan.nextDouble();
		double length= scan.nextDouble();
		
		
	
		System.out.println("the area " + (width*length));
		
		System.out.println("the perimeter " + 2*(width*length));
		
		scan.close();
		
	}

}
