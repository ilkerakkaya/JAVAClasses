package day35interfacedt;

public interface I01 {
	
	
	/*
	 1-In interfaces all variables are public, static, and final
	 	a) no variables can be updated in an interface
	 	b) if u do not assign first value u will get CTE
	 	c)it is common variable for all child class objects
	 */
	int x=12;
	
	
	/*
	 1-Interface is not a class, it is just interface.
	 2-There are 2 types of abstraction a- Partial Abstraction: If u create an abstract class some methods are abstract some are concrete. As u see all method are not abstract
	 										because of that we name using abstract classes partial abstraction
	 									b- Full Abstraction: All methods must be abstract. If you use interface, it is must make all methods abstract inside an interface. 
	 										because of that using interfaces is named as full abstract. 
	 										
	 3-In interfaces all methods are abstract automatically, because of that when u create a method no need to type abstract.  
	 4-In  interfaces all methods are public, even u type or not. 
	 5-You cannot create object by using interfaces.
	 6-All methods are abstract in interface and we know abstract method must be overridden by concrete child classes 
	 	so all methods in interfaces must be overridden by concrete child classes
	 */
	
	void add1 () ;
	public void add2();
	public abstract void add3();
	abstract void add4();
	
	//All these 4 are same
}




