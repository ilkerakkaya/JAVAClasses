package day04operatorsifstatementdt;

import java.util.Scanner;

public class ifstatement02 {

	public static void main(String[] args) {
		// Type java code by using if-else statement,
		//if the password is “JavaLearner”, output will be “The password is true”.
		//Otherwise, output will be “The password is false”.

	
		String password="JavaLearner";
		
		if(password.equals("JavaLearner")){
		System.out.println("Password is true");
		}
		if(!(password.equals("JavaLearner"))){
		System.out.println("Your password is not true");
		}
	
	}

}
