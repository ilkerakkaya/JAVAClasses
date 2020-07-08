package day29overridingdt;

public class MethodSignature {

	public static void main(String[] args) {
	

	}
	
	/*
	 Method signatures contains just  name and parameters. 
	 access modifier, return type, method body or other keywords are not in method signature
	 */
	
	public void add () {
		System.out.println("Addition");
	}

	public int add (int i) {
		System.out.println("Addition");
		return 5;
	}

	
	private int add (String str) {
		System.out.println("Addition");
		return 5;
	}

}
