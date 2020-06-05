package days02variablesscannerdt;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		/*
		 
		 7) Type a program which converts the mile to kilometer. Mile value will be
		entered by user. (Use double)
		Hint 1: km = mile x 1.6
		Hint 2: To get double, use nextDouble()
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Calculate Miles to KM");
		
		double num1=scan.nextDouble();
		
		System.out.println("Converting Mile to KM is "  + num1*1.6);
		
		scan.close();
		

	}

}
