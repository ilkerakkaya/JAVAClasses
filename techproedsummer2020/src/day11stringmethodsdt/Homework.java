package day11stringmethodsdt;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 7) Ask user to enter password, if the password is okay for the following conditions output will be
“Your password is created successfully.” If the password is not okay for any of the following conditions Output will be “Enter a new password according to the give conditions”
1.First letter must be uppercase 2.Last letter must be lowercase 3.Password must contain 6 characters

		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("write integer");
		String password=scan.next();
		
		int LengthOfPass= password.length();
		String firstCh=password.substring(0,1);
		String lastCh=password.substring(LengthOfPass-1, LengthOfPass);
		
		boolean upperCaseCheck=(firstCh == firstCh.toUpperCase());
		boolean lowerCaseCheck=(lastCh == lastCh.toLowerCase());
		boolean lengthCheck= (LengthOfPass == 6);
		
		
		if(upperCaseCheck && lowerCaseCheck && lengthCheck ) {
			System.out.println("ur password is valid");
		}else {
			System.out.println("ur password doesn't valid");
		}
//		
		
		//8th question
		/*
		 8) Ask user ta enter his/her first name, last name and Social Security Number. Then type a program which makes
		a) initials of the first name and the last name in uppercase,
		other characters will be in lowercase.
		b) all characters except last 4 characters of the Social Security Number “ * ”.
		For example; Suleyman Alptekin ***5678
		 */
		
		System.out.println("First NAme");
		String fName=scan.next();
		System.out.println("LastName");
		String lName=scan.next();
		System.out.println("Socual Secutry Number");
		String ssn=scan.next();
		
		
		
		String firstChFName=fName.substring(0,1).toUpperCase();
		String firstChLName=lName.substring(0,1).toUpperCase();
		String hideSsn="***" +ssn.substring(3,ssn.length());
		
		fName= fName.replaceFirst(fName.substring(0,1), firstChFName);
		lName= lName.replaceFirst(lName.substring(0,1), firstChLName);
		
		System.out.println(fName +" " + lName +" " +hideSsn);
		
		scan.close();
	}

}
