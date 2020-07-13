package day32exceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
	
	/*
	 To handle a CT Exception u have 2 options, 1. u can use "throws" keyword between ")" and "{"  2. way is u can use "try-catch" block which is better.
	 If u use more than 1 catch block and if there is parent child relationship between Exception classes  you have to use child exception class first otherwise u will get CTE.
	 -Finally block runs under every condition
	 */

	public static void main(String[] args)  {
		FileInputStream fis=null;
		try {
		 fis=new FileInputStream ("src/day31exceptionsdt/TextFile");
		
		int i=0;
		while ((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		fis.close();
		
		System.out.println(5/2);
		
		} catch (FileNotFoundException e) {
			System.out.println("The path is wrong");
			
		}catch (IOException i) {
			System.out.println("The file is not accessable");
		}catch (ArithmeticException e) {
			System.out.println("Do not divide by Zero");
		}finally {
			System.out.println("Done");
		}
		
		}

}

