package day13wrapperscopewhiledt;

public class Scop01 {
	
	int num1=12;
    double dbl;
	public static void main(String[] args) {
		/*
		 Scope means where to use variables 
		 1-if u create a variable inside the class body and outside the methods you can use them in everywhere in inside the class.
		 Note: the variables created inside the class body and outside the methods are called "Instance Variables"
		 
		 				num1 is an instance variable.
		 2- if you create a variable inside a method, you can use it inside that method. Inside the other methods it can not be used. 
		 				ch is a local variables.
		 				
		 		what is the difference between instance and local variables?
		 		==local variables must be initialized but if u want u may not initialize instance variables.
		 		
		 3- if u create a variable inside the method parantheses it is called local variables as well and u can use it just inside method body.
		 
		 4- dont try to use a variable before declaration.
		 */

	}
	
	public void add() {
		num1++;
		System.out.println(dbl);
		char ch= 'a';
		int num2;
		num2=12;
		System.out.println(num2); //if u dont assign any value for a local variable, java does not assign defaeult value
		
	}
	
	public void subtract(int i, int j){
		num1=num1-4;
		//ch='m'; u cannot use ch method here becasue u create it inside add method.
		
	}
	
	
	public void product() {
		//x= x*5;
		//int x=12;
	    // if u tried to use x variable before declaration, it gives compile error.
	}
	
	

}
