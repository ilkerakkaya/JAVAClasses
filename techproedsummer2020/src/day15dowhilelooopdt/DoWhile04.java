package day15dowhilelooopdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		/*
		  
		 */

		Scanner scan = new Scanner(System.in);

		int i = 1;

		do {

			System.out.println("Enter an integer");
			i = scan.nextInt();

		} while (i % 2 != 0);
		System.out.println("u Won");

		scan.close();

	}
}
