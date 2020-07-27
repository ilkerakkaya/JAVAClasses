package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");
		
		//Print the number characters of every element by using Functional Programming
		
		list.stream()
			.map(t->t+"="+t.length())
			.forEach(t->System.out.println(t+ " "));
		
		//Print the number characters of elements more than 5 characters by using functional programming
		list.stream()
					.filter(t->t.length()>5)
					.map(t->t+"="+t.length())
					.forEach(t->System.out.println(t));
		
		
	//	Print the total number of characters of all elements
	System.out.println(list.stream()
			.map(t->t.length())
			.reduce(0, (t,u)->t+u));	
	
	/*
	 1-Add "!" to the end of every element
	 2-Find the total number of characters which contain "k" with functional programming
	 */
	
	int result= list.stream()
				.map(t->t+"!")
				.filter(t->t.contains("k"))
				.map(t->t.length())
				.reduce(0,(t,u)->t+u);
	System.out.println(result);
	
	/*
	 Find the multiplication of length of every element which is starting "A"
	 
	 */
	
	
	int result1=list.stream()
			.filter(t->t.startsWith("A"))
			.map(t->t.length())
			.reduce(1,(t,u)->t*u);
	
	System.out.println(result1);
	
	
	
	/*
	 Concatenate all elements 
	 Print the result
	 */
	
	String result2=list.stream()				
				.reduce("", (t,u)->t+u);
	System.out.println(result2);
	
	
	/*
	 print all element in natural order
	 */
	list.stream()
			.sorted()
			.forEach(t->System.out.print(t+" "));
	
	
	//Print the elements which has less than 6 characters in alphabetic order
	
	list.stream()
				.filter(t->t.length()<6)
				.sorted()
				.forEach(t->System.out.println(t + " "));
	
	
	//Print the minimum value of length of elements 
	int result3=list.stream()		
				.map(t->t.length())
				.reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
	System.out.println(result3);
	
	
	
	////Print the max value of length of elements 
	
	
	int result4=list.stream()		
			.map(t->t.length())
			.reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t : u);
System.out.println(result4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
	
	
		
	}

}
