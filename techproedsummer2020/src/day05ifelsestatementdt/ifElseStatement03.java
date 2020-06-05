package day05ifelsestatementdt;

import java.util.Scanner;

public class ifElseStatement03 {

	public static void main(String[] args) {
		// // Ask user to give you the quantity of the products and the 
		// unit price of the product.
		// If the quantity is more than 1000, print "You got 10% discount" and print
		// the total price on the console.
		// Otherwise, print "No discount" and print the total price on the console
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("write quantitiy");
		
		int quantity=scan.nextInt();
		
		System.out.println("Give me the unit");
		
		int unitprice=scan.nextInt();
		
		
		
		if(quantity>1000) {
			System.out.println("U got %10 discount");
			System.out.println(0.9*unitprice);
		}else {
			System.out.println("u got nothing f.. off");
			System.out.println(unitprice*quantity);
			
			scan.close();
		}

	}

}
