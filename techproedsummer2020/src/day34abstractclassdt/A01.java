package day34abstractclassdt;

public abstract class A01 {
	/*
	 1-To make a class abstract type abstract keyword between access modifier and class keyword
	 2-U cannot create an object from abstract classes.
	 3-We use abstract classes as mandatory or optional "to-do" list for child classes
	  		-abstract methods are mandatory, concrete method is optional
	 4-Abstract classes can have "abstract-method" and "non-abstract(concrete) methods"
	 	"abstract methods (concrete) methods"==> methods with body
	 5-To create an abstract method 
	 		a) Don't put method body
	 		b) Use abstract keyword between access modifier and return type
	 6-Abstract methods must be overridden by concrete child classes otherwise u get CTE
	 7-If u create abstract methods it means u r focusing on "what to do" instead of "how to do"
	 but concrete methods focus on "how to do" more than "what to do".
	 8-Abstract methods hide the body, in other word implementation of the method.
	 9-When u override an abstract method u have to create body otherwise Java complains
	 10-Abstract methods can be juts in abstract classes, u cannot create abstract methods inside the concrete classes
	 */

	public static void main(String[] args) {
		
		
	}
	
	
	public abstract void add();
	
	 

}
