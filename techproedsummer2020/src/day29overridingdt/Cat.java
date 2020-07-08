package day29overridingdt;

public class Cat extends Animal{

	public static void main(String[] args) {
		

	}
	
	public void sound() {
		System.out.println("Cats Meow");
	}
	
	public void eat() {
		System.out.println("Eat Cheese");
	}

	@Override
	public Cat drink() {
		
		return new Cat();
	}

	@Override
	public int add() {
		return 5;
	}

	
	//default methods can be accessed from other classes if u r in a same package so from the same package u can override default methods because of that u cannot override   
	@Override
	void m2() {
		// TODO Auto-generated method stub
		super.m2();
	}

	
}
