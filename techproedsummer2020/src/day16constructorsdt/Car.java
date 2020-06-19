package day16constructorsdt;

public class Car {

	
		int price = 20000;
		int year=2015;
		String make="Honda";
		String type="civic";
		
		
		Car(){
			
		}
		
		
		//Create a constructor without parameters
		
		Car(int price){
			this.price=price;
			
		}
		
		//Create a constructor with 1 parameter
		Car(String make, int year){
			
		}
	//Create a constructor with 4 parameter
		
		Car(String make, int price, int year, String type) {
			this.make=make;
			this.price=price;
			this.year=year;
			this.type=type;
	}
		
		
	
public static void main(String[] args) {
	
	Car c1= new Car();
	System.out.println(c1.price);//
	System.out.println(c1.year);
	System.out.println(c1.make);
	System.out.println(c1.type);
	
	System.out.println("=====================");
	
	Car c2= new Car (10000);
	
	System.out.println(c2.price);
	System.out.println(c2.year);
	System.out.println(c2.make);
	System.out.println(c2.type);
	
	System.out.println("===================");
	
	
	
	//Create a car whose make is infiinity type Q50 year is 2018 price 240000
	
	Car c3=new Car ("infinity", 24000, 2018, "Q50");
	System.out.println(c3.make);
	System.out.println(c3.price);
	System.out.println(c3.year);
	System.out.println(c3.type);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
}
}