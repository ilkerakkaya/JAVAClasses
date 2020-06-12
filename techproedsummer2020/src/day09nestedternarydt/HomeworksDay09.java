package day09nestedternarydt;

import java.util.Scanner;

public class HomeworksDay09 {

	public static void main(String[] args) {
		/*
		 If the user pressed 1, 2, 3 the program will print the number that is pressed;
		otherwise, program will print "Not allowed".
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		
		int number=scan.nextInt();
		
		
		switch (number) {
		
		case 1:
			System.out.println("Passing is Allowed");
			break;
		case 2:
			System.out.println("Passing is Allowed");
			break;
		case 3:
			System.out.println("Passing is Allowed");
			break;
		default:
			System.out.println("enter a valid number");
		
		scan.close();
		}
		
	}

}
