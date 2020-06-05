package days02variablesscannerdt;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		/*
		 Type a program which converts the hours to seconds. Hours value will be
		entered by user. (Use long)
		Hint 1: second = hour x 60 x 60
		Hint 2: To get long, use nextLong()
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("converts the hours to seconds");
		
		long hour=scan.nextLong();
		
		System.out.println("converts the hours to seconds " + hour *( 60 * 60));
		
		scan.close();
		
	}

}
