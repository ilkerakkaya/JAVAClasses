package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeWork01WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		System.out.println("enter an integer");
		int num=scan.nextInt();
		
		
		//!st way
		
		int product=1;
		for (int i=1; i<=num; i++) {
			
			product=product*i;
		}
		
		System.out.println(product);
		
		
		
		//2nd Way
		int prdct=1;
		
		int i=1;
		
		while (i<=num) {
			
			prdct=prdct*i;
			i++;
			
			
		}
		
		System.out.println(prdct);
		
		
		
	}

}
