package day32exceptionsdt;

public class interview {
	/*
	 What is the difference between "final", "finally", and "Finalize()"?
	 
	 1) final: we can use "final" keyword for 
	 		a-Variables==> Their values can not be updated
	 		b-Methods==>The body of final methods is in its final state, it means u cannot update the body of the final method. 
	 		if u cannot update the body overriding is not meaningful. Because of that Java does not allow to override final methods. 
	 		c-Class==>Final classes cannot be inherited. It means a final class cannot be parent classes or a final class cannot have child classes
	 2)finally:We can use finally code block after try catch block. It runs under every condition. For example; to cut connection with the cloud we can use finally code-block.
	 3)finalize(); We can use finalize() method to make the unused objects ready to be destroyed by Garbage Collector. When we call finalize method, it is not certain 
	 finalize() method will run. JAva decides when and how to run finalize().
	 */

	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
