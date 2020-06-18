package day13wrapperscopewhiledt;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// Type java code by using while loop
		//find sum of the digits that will be given by user

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a positive number");
		int num=scan.nextInt();
		int sum=0;
		
		
		while(num!=0) {
			int lastDigit=num%10;
			num=num/10;
			
			sum=sum+lastDigit;
		}
		
		System.out.println(sum);
	}

}
