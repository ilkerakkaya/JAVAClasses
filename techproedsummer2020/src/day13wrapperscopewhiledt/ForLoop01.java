package day13wrapperscopewhiledt;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String
		 Type java code to print the String reverse on the console
		 For example; for "Germany" output will be "ynamreG"
		 */
		
		//1st way
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word which has 4 characters");
		String str = sc.nextLine();
		
		
		
		String name1 = new StringBuilder(str).reverse().toString();
		System.out.println(name1);
	
	//2nd way
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
	
			
			
		}
	sc.close();
	}

}
