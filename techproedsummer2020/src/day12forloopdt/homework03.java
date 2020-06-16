package day12forloopdt;

import java.util.Scanner;

public class homework03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
		For example; if user enters “MARK” output will be “KRAM”
		 */
		
		//1st way
		
		String name = new StringBuilder("hi").reverse().toString();
		System.out.println(name);
		
		
		//2nd way
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter:");
		String name1=scan.next();
		
		
		if (name1.length()==4) {
			System.out.println(" " + name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0));
		}else {
			System.out.println("it is not ok");
		}
		
	}

}
