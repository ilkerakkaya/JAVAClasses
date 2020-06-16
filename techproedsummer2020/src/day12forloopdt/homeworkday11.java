package day12forloopdt;

import java.util.Scanner;

public class homeworkday11 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his kid’s name, if the name contains “a” output will be “This name contains ‘a’.”
		if the name contains “z” output will be “This name contains ‘z’.” Otherwise, output will be
		“This name contains neither ‘a’ nor ‘z’.”
		 */
		
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter a name");
			
			String name=scan.next();
			
			if(name.contains("a")) {
				System.out.println("this name has a letter");
				
			}
			if(name.contains("z")) {
				System.out.println("this is name has z letter");
			}
			
			else {
				System.out.println("this name cantains neither a nor z");
			}
	}

}
