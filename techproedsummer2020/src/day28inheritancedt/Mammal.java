package day28inheritancedt;

public class Mammal extends Animal {
	
	
	public Mammal() {
		super ("Johnny");
		System.out.println("M");
	}

	
	public Mammal (String name) {
		System.out.println("Body");
	}
	
	
	//if u try to use non-existing constructor u will get CTE.
	
	public static void main(String[] args) {
		
		Mammal mammal=new Mammal();
	}

}
