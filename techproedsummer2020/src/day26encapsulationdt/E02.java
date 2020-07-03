package day26encapsulationdt;

public class E02 {

	public static void main(String[] args) {
		
		
		E01 obj1=new E01();
		System.out.println(obj1.retired);	
		
		System.out.println(obj1.retired);
		System.out.println(obj1.getName());
		
		
		System.out.println(obj1.getSalary());
		obj1.setSalary(90000);
		System.out.println(obj1.getSalary());
		
		
		
		//Create an object from E03 Class
		E03 obj2=new E03();
		System.out.println(obj2.getDisease());	
		System.out.println(obj2.isOld());
		
		/*
		 If you do not want ant data to be updateable Do Not create setters
		 */
		
		
		
		
		
		
	}

}
