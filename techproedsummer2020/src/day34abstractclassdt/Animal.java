package day34abstractclassdt;

public abstract class Animal extends Creature{

	public static void main(String[] args) {
		

	}
	
	public abstract void eat ();
	
	public abstract void sound ();
	
	public  void drink () {
		System.out.println("Animals drink water");
	}

	@Override
	public void breathe() {
		System.out.println("Animal breathe");
		
	}

	

}
