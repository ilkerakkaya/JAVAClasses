package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkWhileLoop03 {

	public static void main(String[] args) {
		/*
		/*
		 Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("write integer");
		int positive=scan.nextInt();
		positive=Math.abs(positive);//bu sekilde verilen rakalami positif yapar
		int i=1;
		
		
		
			while(i<11) {
				System.out.println(positive*(i++));
		}
		
		
		}
	}


