package day28inheritancedt;

public class StudentDesk extends Classroom{
	
	boolean broeken=false;

	public static void main(String[] args) {
		
		
		//if u have variables whose names are same to understand which one will be used u should look at the data type object.
		//In the following example; if constructor of sdt1 is Stundetdesk the output date type is "sdt" is StudentDesk the output will be false.
		//if the 
		
		
		
		StudentDesk sdt1 = new StudentDesk();
		System.out.println(sdt1.broeken);//false
		System.out.println(sdt1.area);
		System.out.println(sdt1.initial1);
		
		sdt1.desk();
		
		
		Classroom sdt2=new StudentDesk();
		System.out.println(sdt2.broeken);//true
		System.out.println(sdt2.area);//300m2
		sdt2.desk();
		
		
		Scholl sdt3=new StudentDesk();
		System.out.println(sdt3.area);//400000
		
		
		Classroom sdt4=new  Classroom();
		sdt4.desk();
	}
	
	public void desk () {
		System.out.println("New desk");
	}

}
