package day07nestedifternarydt;

import java.util.Scanner;

public class HomeWorkQuestion02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter any name of the week, then get second ,fourth,
		and sixth letter of the day name and print them on the console,
		in the same line. For example; if the user enters “Monday” output will be “ody”*
		 */
			
			Scanner scan=new Scanner(System.in);
			System.out.println("enter name of the week");
			
			String day=scan.next();
			
			char secondletter= day.charAt(1);
			char fourthletter=day.charAt(3);
			char sixth=day.charAt(5);
			
			System.out.println("1th, 3rd, 6th " + secondletter+fourthletter+sixth);
			
			scan.close();
	}

}
