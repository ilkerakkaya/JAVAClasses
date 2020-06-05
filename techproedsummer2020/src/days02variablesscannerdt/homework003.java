package days02variablesscannerdt;

import java.util.Scanner;

public class homework003 {

	public static void main(String[] args) {
		/*
		 5)Type a program which calculates the area and the perimeter of a circle
		whose radius is entered by user. (Use float)
		Hint 1: Take pi number as 3.14159
		Hint 2: Area of a circle is 3.14159 x radius x radius
		Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
		Hint 4: To get float, use nextFloat()
		 */

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please Calculate the area and perimeter of circle");
		
		float pi=scan.nextFloat();
		float radius=scan.nextFloat();
		
		System.out.println("Area of a circle is " + 3.14159 *(radius*radius));
		System.out.println("Perimeter of a circle is " + (2 * 3.14159) * radius);
		
		scan.close();
		
		
		
	}

}
