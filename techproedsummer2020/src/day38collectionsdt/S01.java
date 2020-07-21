package day38collectionsdt;

import java.util.HashSet;

public class S01 {
	
	/*
	1) Set: in all elements must be unique, u cannot repeated elements in a Set
	2) We have 3 types of sets in JAVA
	 		a-HashSet
	 		b-LinkedHashset
	 		c-TreeSet
	 3) HAshSet uses hashing techniques: - Uses "hasting techniques
	 									 - Does not maintain any order, it returns elements in random order.
	 									 - When u try to add repeated elements JAVA does not give CTE
	 									 or RTE. JAva overwrites the new element to the old one.
	 									 - Adding "null" is an element in a HashSet is allowed
	 									 -HashSet does not put elements in any order, it means HashSet does not work on ordering elements, it saves time for HashSet b
	 									  because of that HashSet is faster than LinkedHashSet and TreeSet. 
	 									  If the order of elements is not important for your program use HashSet to be fast 
	 */

	public static void main(String[] args) {
		
		HashSet<String> hs =new HashSet<>();
		hs.add("Angie");
		hs.add("Brad");
		hs.add("Boby");
		hs.add("Angie");
		hs.add("Ruby Strar");
		hs.add(null);
		System.out.println(hs);
	

	}

}
