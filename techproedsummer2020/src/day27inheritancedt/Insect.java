package day27inheritancedt;

public class Insect extends Animal {
	
	boolean poisonous=true;

	public static void main(String[] args) {
		
		Insect insect=new Insect();
		System.out.println("CAn insect breathe" + insect.breathe);
		System.out.println("CAn insect poisonous" + insect.poisonous);
		
		
		insect.drink();
		insect.eat();
		insect.drink();
		insect.invisible();
		insect.move();
		

	}
	
	public void invisible() {
		System.out.println("Some of the insects are invisible");
	}

}
