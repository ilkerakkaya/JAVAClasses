package day32exceptionsdt;

public class E02 {

	
	static String s3;
	
	
	public static void main(String[] args) {
		String s1="";
		System.out.println(s1.length());  //length() returns the number of characters in a String. s1 has no any character so it is 0
		
		String s2=null;
//		System.out.println(s2.length());//if u try to get the length of null object u will get "NullPointer" exception
		
		
//		System.out.println(s3.length());//Because default value for Strings in Java is "null"
	}

}
