package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkWhileLoop04 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		Write a program that prompts the user to input a positive integer.
		It should then print factorial of that number
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("write integer");
		int f=scan.nextInt();
		int sum=1;
		
		
		int k=1;
		while(k<=f) {
			
			sum=sum*k;
			k++;
		}
		System.out.println(sum);
		
		
		//2nd way

				int multi=scan.nextInt();
				int toplam=1;
				
				for(int a=1; a<=multi; a++) {
					toplam*=a;
					
				}
				System.out.println(toplam);

	}}



	
		
		