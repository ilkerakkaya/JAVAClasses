package day19staticblockarraysdt;

public class StaticBlock {
	
	static int i;
	static double pi;

	
	static {
		pi=3.14;
		System.out.println("2nd static block");
	}
	
	static {
		i=12;
		System.out.println("1st static block");
	}
	
	StaticBlock(){
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
		/*
		Static block is a code block.
		we use static blocks to initialize(Assigning first value ) static variables. 
		Static blocks are executed before all methods, main methods, before all constructors 
		if u have more than one static blocks, java runs the above one first
		 */
		System.out.println("I am main method");
		StaticBlock obj1=new StaticBlock();
		
	}

}
