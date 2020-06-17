package day13wrapperscopewhiledt;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a positive number");
		int num=scan.nextInt();
		
		int i=1;
		int count=0;
		
		while ( i<=num) {
			
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
			i++;
			
		}
		System.out.println(count);
	
	}

}
