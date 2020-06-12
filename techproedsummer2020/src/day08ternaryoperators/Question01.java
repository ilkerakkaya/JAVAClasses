package day08ternaryoperators;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male 
		then output will be “Hey man you retired!” else output will be “No need to work
		 */

		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a gender");
		
		String gender=scan.next();
		System.out.println("Enter ur Age");
		
		int age=scan.nextInt();
		
		if (age>65 && gender.equalsIgnoreCase("male")) {
			System.out.println("Yuru get evinde yat emekli ol ");
			
		}else {
			System.out.println("no need workm");
		}
	}

}
