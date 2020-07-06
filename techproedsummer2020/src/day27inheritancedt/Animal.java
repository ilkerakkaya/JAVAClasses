package day27inheritancedt;

public class Animal {
	
	public boolean breathe=true;
	
	
	//private method or variables cannot be inherited, because private things cannot be accessed from other classes
	private String type ="Animal";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void eat() {
		System.out.println("They eat");
	}
	
	public void drink () {
		System.out.println("They drink");
	}
	
	public void move() {
		System.out.println("They move");
	}

}
