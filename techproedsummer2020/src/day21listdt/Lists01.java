package day21listdt;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		// What is the difference between Arrays and list?
		//  -Arrays are fixed in length but list are flexible in length
		//   "Lists are resizable Arrays"

		
		
		// How to create a list
		
		//1st Way
		
		ArrayList<String> l1=new ArrayList<String>();
		
		//2nd Way
		ArrayList<String>l2=new ArrayList<>();
		
		//3rd Way
		List<String> l3= new ArrayList<>();
		
		
		//How to print a list on the console
		
		// To print a list on the console just put the name of the name list
		//inside the system.out.println()
		
		System.out.println(l1);
		
		//How to add elements into a list
		//add() method inserts the elements to the end 
		
		l3.add("John");
		System.out.println(l3);
		
		
		
		l3.add("Mahmut");
		System.out.println(l3);
		
		
		
		//how to add an element into specific index
		l3.add(1, "Mark");
		System.out.println(l3);
		
		l3.add(0, "Ilker");
		System.out.println(l3);
		
		l3.add(4, "Akkaya");
		System.out.println(l3);
		
		
	//How to add a list into a list
		
		l2.add("X");
		l2.add("Y");
		System.out.println(l2);
		
		
		l3.addAll(l2);
		System.out.println(l3);
	
		
		//How to add a lost into a specific index
		l3.addAll(4, l2);
		System.out.println(l3);
		
		
		//How to get the number of elements (size) in a list
		
		System.out.println(l3.size());
		
		
		
		//How to check if a list is empty or not
		//isEmpyty() returns boolean if the list has no any element it returns true
		
		System.out.println(l3.isEmpty());		
		System.out.println(l2.isEmpty());	
		
		
		//How to remove an element from a list
		l3.remove("Trump");
		System.out.println(l3);
		
		
		
		l3.remove("X");
		System.out.println(l3);
		
		
		//How to remove an element in a specific index
		
		l3.remove(2);
		System.out.println(l3.remove(2));
		System.out.println(l3);
		
		
		
		
		//How to update an element in a list
		
		l3.set(2, "Adam");
		System.out.println(l3);
		
		
		
		//How to check if a specific element exist in a list 
		
		System.out.println(l3.contains("John"));
		
		
		
		//How to sort list elements in a list in ascending order
		
		Collections.sort(l3);
		System.out.println(l3);
		
		
		//how to delete all elements in a list
		
		l3.clear();
		System.out.println(l3);
		
		
		//Can we use primitive in lists?
		//We cannot use primitive in list instead of primitive data types we use
		//Wrapper classes
		
		List<Integer> l4=new ArrayList<>();
		List<Boolean> l5= new ArrayList<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
