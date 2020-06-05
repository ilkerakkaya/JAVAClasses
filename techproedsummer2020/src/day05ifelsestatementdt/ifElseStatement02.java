package day05ifelsestatementdt;

import java.util.Scanner;

public class ifElseStatement02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Give the initial of ur name");
		
		char initial=scan.nextLine().charAt(0);
		
		if(initial=='i') {
			System.out.println("You got it");
			
		}else {
			System.out.println("Try again");
		}
		scan.close();
		
	}

}
