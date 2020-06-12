package day08ternaryoperators;

import java.util.Scanner;

public class ternary01 {

	public static void main(String[] args) {
		// Ask user to enter an integer, if the integer is greater than 10. print good on the conseole. otherwise print bad on the console.
	
		Scanner scan=new Scanner(System.in);
		System.out.println("make it");
		
		int integer=scan.nextInt();
		
		
		if (integer>10) {
			System.out.println("good");
			
		}else {
			System.out.println("bad");
		}
		
		//2. way
		
		String result = integer>10 ? "good" : "bad";
		System.out.println("make itttttt");
	}

}
