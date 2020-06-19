package day16constructorsdt;

public class Animals {
	
	int height=50;
	String name="rabbit";
	boolean mammal=true;
	
	Animals(){
		
	}
	
	
	
	
	
	
	Animals( int height) {
		this.height=height;
		
		
}
	
	
	

	public static void main(String[] args) {
		/*
		 Create 2 Cons. one is with parameter other is without. By using const. create 2 objects 
		  */
	
	 
		Animals an1= new Animals();
		System.out.println(an1.name);//
		System.out.println(an1.height);
		System.out.println(an1.mammal);
		
		System.out.println("=============");
		
		
		Animals an2= new Animals(60);
		System.out.println(an2.name);//
		System.out.println(an2.height);
		System.out.println(an2.mammal);
		
	}

}
