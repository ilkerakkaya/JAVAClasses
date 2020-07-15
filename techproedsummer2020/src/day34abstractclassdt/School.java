package day34abstractclassdt;

public abstract class School {
	
	//1-Abstract classes need child classes to be meaningful, if u make an abstract class final it means it cannot have child classes, 
	//this is contradiction so that Java complains being final abstract class.
	//In conclusion abstract classes cannot be final.
	
	/*
	 2-An abstract method cannot be final because final methods cannot be overridden but the reason to create abstract method is to make mandatory overriding  
	 3-An abstract method's access modifier can be public or protected do not use private methods cannot be accessed from other classes.
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public abstract void add ();
	
}
