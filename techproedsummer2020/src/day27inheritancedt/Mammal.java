package day27inheritancedt;

public class Mammal extends Animal{
	
	
	
	//Smell variable has default access modifier thats why if u try to inherit from other packages
	// u cannot inherit other packages
	// in day26 packages we created Rabbit class but could not inherit smell variable
	String smell="they smell well";
	static boolean die = true;

	public static void main(String[] args) {
		

	}
	
	/*
	 public and protected variables or methods can be inherited without any issue. 
	 */
	
	/*
	 Child Class= subClass <==> Parent class= Super Class
	 */
	
	/*
	 
	 */
	
	public void feed() {
		System.out.println("They feed their babies");
	}

}
