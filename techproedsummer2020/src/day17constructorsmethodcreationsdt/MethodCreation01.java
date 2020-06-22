package day17constructorsmethodcreationsdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add();
		substract(5,3);//if ur methids has parameters when u call the method, u havet o use values 4 the parameters
							// values for parameters are calles arguments on java
		
		multiply(5, 4);

	}
	
	
	public static void add () {
		System.out.println("Addition");
	}
	
	public static void substract (int x, int y) {
		System.out.println(x-y);
	}
	
	
	//if u use return type different from void u have to use return, keyword in the last line of the method body.
	public static int multiply (int x, int y) {
		return x*y;
	}
	

}
