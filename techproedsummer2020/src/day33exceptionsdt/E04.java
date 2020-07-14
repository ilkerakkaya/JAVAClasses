package day33exceptionsdt;

public class E04 {

	public static void main(String[] args) {
		
		try {
			
		Object obj =new Integer (8);
		String s = (String)obj;//Explicit narrowing
		}catch (ClassCastException e) {
			System.out.println(e);
			//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
		}
		
	}

}

/*
 CTE
 1-FileNotFoundException==>Path+Existence of file
 2-IOException==>read + write + class files
 
 
 Unchecked Exception (RTE)
 3-ArithmeticException==> Math rules for example dividing by 0
 4-NullPointerException==>length() for null
 5-ArrayIndexOutOfBoundsException==>Using non-existing index for arrays
 6-IllegalArgumentException==>for logical errors for example negative numbers for age
 7-ClassCastException==>if u try to cast Object class to String class
 8-NumberFormatException==>When u use parselInt() with a String which is not created by digits
 */
