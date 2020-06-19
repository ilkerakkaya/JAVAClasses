package day15dowhilelooopdt;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
//		 by using do-while loop.
		
		Scanner scan=new Scanner (System.in);
	
		
		
		int i = 1;
		
		do {
			
			if(i%5==0) {
				System.out.println(i + " ");
				
			}
			
			i++;
		}while(i<=100);
	}

}
