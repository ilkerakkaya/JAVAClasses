package day17constructorsmethodcreationsdt;

public class Animal {
	
	int age=7;
	String name= "Dog";
	boolean mammal;
	
	
	Animal (){
	System.out.println("No parameter");	
	}
	
	
	
	
	Animal(boolean mammal){
		this();
		System.out.println("boolean");
	}
	
	
	
	Animal(int age, String name){
		System.out.println("int and String");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Animal a1= new Animal (true);
	}

}
