package days02variablesscannerdt;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the perimeter of a triangle whose
		Side lengths are entered by user. (Use byte)
		Hint 1: Perimeter of a triangle is a + b + c
		Hint 4: To get byte, use nextByte()
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lengths must be written");
		
		byte num1=scan.nextByte();
		byte num2=scan.nextByte();
		byte num3=scan.nextByte();
		System.out.println("Perimeter of a triangle is " + (num1+num2+num3) );
		
		scan.close();
		
		
	}

}
