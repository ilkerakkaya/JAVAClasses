package day33exceptionsdt;

public class E03 {

	public static void main(String[] args) {
		long x = 1234;
		int y =(int)x;//Explicit narrowing
		
		
		try {
		String s="John";
		Integer z = Integer.parseInt(s);
		
		}catch (ClassCastException e) {
			System.out.println("String cannot be casted to integer");
		}
	}

}
