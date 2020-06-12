package day08ternaryoperators;

import java.util.Scanner;

public class ternary02 {

	public static void main(String[] args) {
		/*
		 Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
		 */
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter an integer");
			
			int a=scan.nextInt();
			
			
			if (a%2 == 0){
				System.out.println("The integer is even.");
			}else {
				System.out.println("The integer is odd.");
			}

			
			String result= a%2==0 ? "the integer is even" : "the interger is odd";
			
			scan.close();
			
			
	}

}
