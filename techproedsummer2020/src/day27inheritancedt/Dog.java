package day27inheritancedt;

public class Dog extends Mammal {
	
	boolean loyal=true;

	public static void main(String[] args) {
		
		Dog dog= new Dog();
	System.out.println("Can a Dog breathe" + dog.breathe);	
	System.out.println("Can a Dog loyal" +dog.loyal);
	System.out.println("Can a Dog smell" +dog.smell);
	
	//I am able to use static "die" variable but it is not because of the inheritance it is because of the being static
	
	dog.bark();
	dog.drink();
	dog.eat();
	dog.feed();
	dog.move();
	
	}
	
	public void bark () {
		System.out.println("they bark");
	}

}
