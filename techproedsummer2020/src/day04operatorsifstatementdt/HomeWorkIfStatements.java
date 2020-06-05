package day04operatorsifstatementdt;

import java.util.Scanner;

public class HomeWorkIfStatements {

	public static void main(String[] args) {
//		/*
//		 1) Type java code, if an integer is even, output will be “The integer is even”.
//If the integer is odd, output will be “The integer is odd”.
//		
//		 */
//		
//		Scanner scan= new Scanner(System.in);
//			System.out.println("Write an integer");
//		
//		int num=scan.nextInt();
//			if(num%2==0) {
//				System.out.println("This is even integer");
//			}
//			
//			if(num%2==1) {
//				System.out.println("this is odd integer");
//			}
//			
//			scan.close();
		
		
		
//		2) Type java code by using if statement. When you enter the initial of the day of a week,
//	output should be all possible names of the days.
//	For example; if the initial is ’S’ output should be “Saturday or Sunday”
		
		
//	Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an initial");
//    
//        String initial = scan.nextLine().toLowerCase();
//        
//        if(initial.contains("s")) {
//            System.out.println("Saturday or Sunday");
//        }
//        
//        if(initial.contains("m")) {
//            System.out.println("Monday");
//        }
//        if(initial.contains("t")) {
//            System.out.println("Tuesday and Thursday");
//        }
//        if(initial.contains("w")) {
//            System.out.println("Wednesday");
//        }
//        if(initial.contains("f")) {
//            System.out.println("Friday");
//        }
//        else{
//            System.out.println("check your letter");
//           
//        }
//				scan.close();
		
		
		
		
		

		
//		3) Type java code by using if statement. When you enter the name of the day of a week,
//	output will be “Weekday” or “Weekend day” according to the name of the day.
				
//	Scanner scan=new Scanner(System.in);
//		System.out.println("Write name of the day");
//		
//		String dayName=scan.nextLine().toLowerCase();
//		
//		if(dayName.contains("Monday".toLowerCase())) {
//			System.out.println("WeekDay");
//		}
//		if(dayName.contains("Tuesday".toLowerCase())) {
//			System.out.println("WeekDay");
//		}
//		if(dayName.contains("Wednesday".toLowerCase())) {
//			System.out.println("WeekDay");
//		}
//		if(dayName.contains("Thursday".toLowerCase())) {
//			System.out.println("WeekDay");
//		}
//		if(dayName.contains("Friday".toLowerCase())) {
//			System.out.println("WeekDay");
//		}
//		
//		if(dayName.contains("Saturday".toLowerCase())) {
//			System.out.println("Weekend");
//		}
//		if(dayName.contains("Sunday".toLowerCase())) {
//			System.out.println("Weekend");
//		}
//		scan.close();
		
		
		
		
//		4) Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
		
		Scanner scan=new Scanner(System.in);
		
			System.out.println("Enter Values");
			
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if(num1==num2) {
			System.out.println("This is square");
		}
		
		if(num1!=num2) {
			System.out.println("This is not square");
		}
		
		scan.close();
		
		
		
		
			}
	
	}
	


