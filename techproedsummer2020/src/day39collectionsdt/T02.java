package day39collectionsdt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class T02 {
	
	/*
	 1-TreeSet is a Set so no duplication
	 2-TreeSet puts the elements in ascending order
	 3-TreeSet is the slowest set
	 4-TreeSet does not accept "null"
	 5-If u try to add repeated elements JAva will overwrite
	 */

	public static void main(String[] args) {
		
		LocalTime lt1=LocalTime.now();
		System.out.println(lt1);
		Set<String> tSet=new TreeSet<>();
		tSet.add("Ali");
		tSet.add("Mark");
		tSet.add("Brandan");
		tSet.add("Angie");
		tSet.add("Ali");
		
	
		
		System.out.println(tSet);
		
		
		LocalTime lt2=LocalTime.now();
		System.out.println(lt2);
		
		
		Set<String> hSet=new HashSet<>();
		hSet.add("Ali");
		hSet.add("Mark");
		hSet.add("Brandan");
		hSet.add("Angie");
		
		
		Set<String>tSet2= new TreeSet<>(hSet);//Convert HashSet to TreeSet
		
		
		
		
		System.out.println(hSet);
		
		LocalTime lt3=LocalTime.now();
		System.out.println(lt3);
		
		
		//When do we use TreeSet we have 2 options
			//	a-Directly create a TreeSet and add the elements to it.
			//  b-Create a HashSet, add the elements to HashSet then convert to HashSet to TreeSet
		//First Way is slow, we use 2. way to make it faster.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
