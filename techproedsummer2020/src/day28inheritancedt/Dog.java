package day28inheritancedt;

public class Dog extends Mammal{
	
	
	public Dog () {
		super();//To call parent constructors we use super(), but is not mandatory
		System.out.println("D");
	}

	public static void main(String[] args) {
		
//		Dog dog =new Dog ();
//		Insect insect = new Insect ();
		
		Cat cat = new Cat ();
	}

}
