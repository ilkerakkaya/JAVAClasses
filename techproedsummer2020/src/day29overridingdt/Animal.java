package day29overridingdt;

public class Animal {

	public static void main(String[] args) {
		
	}
	/*
	 The overriding methods(methods inside the child class) cannot use 
	 more restricted access modifiers than overridden(methods inside the parent class) methods.
	 The access modifiers of overriding methods can be same with or wider than overridden methods.
	 For example; if overridden method's access modifier is "default" then overriding method's access modifier 
	 can be "default", "protected", and "public"
	 */
	/*
	 The return type of overriding methods(methods inside the child class) must be 
	 1) same with the return type of overridden(methods inside the parent class) methods
	 2) the child of the return type of overridden(methods inside the parent class) methods
	 */
	
	/*
	 If the return type of overridden method is primitive then
	 the return type of overriding method must be same with the
	 return type of overridden method. Because there must be 
	 "IS-A" relationship between the return type in overriding
	 and "IS-A" relationship can be between the classes but primitives
	 are not classes so we cannot talk about "IS-A" relationship between 
	 primitives.
	 */
	
	
	public void sound() {
		System.out.println("Animals make sound");
	}
	
	public void eat() {
		System.out.println("Eat everything");
	}

	//In the following method; return type is Animal. We can use class names as return type in methods.
	//When u use return type different from "Void" u have to use return keyword.
	//After the return keyword you must type something whose data is matching with return type.
	//To create an object we can use "new" keyword and constructor but sometimes Java gives us different ways to create an object from a class like String str="ali"
	public Animal drink() {
		return new Animal ();
	}


	public int add() {
		return 4;
	}
	
	
	
	//If a method is final it means u cannot update its body.
	//if u cannot update body of a method it means overriding is not meaningful because of that java does not allow to override final method
	public final void product () {
		System.out.println("Multiplication");
	}

	
	//Java does not allow to override static methods because static methods are shared by all objects so, firstly no need to override secondly if a class updates the body it will affect all other classes this can cause some problems
	public static void division () {
		System.out.println("Division");
	}
	
	
	//u cannot access to private methods from other classes so u cannot override private methods
	private void m1() {
		System.out.println("Method one");
	}
	
	
	void m2() {
		System.out.println("Method 2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
