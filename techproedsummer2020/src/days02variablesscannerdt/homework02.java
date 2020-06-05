package days02variablesscannerdt;

import java.util.Scanner;

public class homework02 {

	public static void main(String[] args) {
		/*
		 4) Type a program which calculates the volume of a rectangular prism
		whose length, with, and height are entered by user.
		Hint 1: Volume of a rectangular prism is width x length x height
		 */
		
		Scanner prism = new Scanner(System.in);
		System.out.println("Calculate the prism");
		
		
		double width=prism.nextDouble();
		double length=prism.nextDouble();
		double height=prism.nextDouble();
		
		System.out.println("Volume of rectangular " + (width*length*height));
		
		prism.close();
	}

}
