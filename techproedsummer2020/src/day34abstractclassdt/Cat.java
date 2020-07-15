package day34abstractclassdt;

public abstract class Cat extends Animal{

	public static void main(String[] args) {
		// 1- if the child class is concrete it must to override abstract methods but if the child class is abstract overriding abstract methods is optional
		// 2- If any parent an abstract method then it is optional for the concrete child class to override.

	}

	public abstract void eat ();
	
	
	public abstract void sound ();
	
	@Override
	public void drink() {
		System.out.println("Cats drink water and milk");
	}

}
