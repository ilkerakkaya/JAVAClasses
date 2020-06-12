package day09nestedternarydt;

import java.util.Scanner;

public class Swicth03 {

	public static void main(String[] args) {
		/*
		 Use switch statement
		 Ask user to enter the name of a month
		 The program should print the number of month
		 For example March ==> 3, June ==> 6
		 */
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Write the name of the month");
		
		String month=scan.next().toLowerCase();
		
		switch(month) {
		case "January":
			System.out.println("First month");
			break;
		case "February":
			System.out.println("Second month");
			break;
		case "March":
			System.out.println("Third month");
			break;
		case "April":
			System.out.println("Fourth month");
			break;
		case "May":
			System.out.println("Five month");
			break;
		case "June":
			System.out.println("Six month");
			break;
		
	        
	    
		}}}
	
