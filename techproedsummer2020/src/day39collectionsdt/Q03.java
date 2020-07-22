package day39collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q03 {
	/*
	 1)Queue is an interface not a class so we cannot create object by using Queue
	   When you want to work on Queue you can create objects by using a)LinkedList class or
	   b)PriorityQueue class
	 2)In Queue every time elements are added to the end of the Queue, when you remove an element
	   every time it will be removed from the beginning of the Queue.  
	      FIFO ==> First In First Out 
	 3)Queue accepts "null" as an object   
	 */


	public static void main(String[] args) {
		
		Queue<String>q1=new LinkedList<>();
		
		q1.add("Ali");
		q1.add("Tucker");
		q1.add("Chris");
		q1.add("Brandon");
		q1.add("Mark");
		q1.add(null);
		q1.add("Ali");
		System.out.println(q1);
		
		
		q1.remove();	
		System.out.println(q1);
		
		q1.remove(null);
		System.out.println(q1);
		
		List <String>list=new ArrayList<>();
		list.add("Brandon");
		list.add("Ali");
		
		q1.removeAll(list);
		System.out.println(q1);
		
		
		//element() returns the first element without removing
		//If Queue is empty element() gives exception
		System.out.println(q1.element());
		System.out.println(q1);

		
		//Poll() returns the first element after removing
		System.out.println(q1.poll());
		System.out.println(q1);

		//peek() returns the first element without removing
		//If queue is empty peek() does not give exception it returns "null"
		
		System.out.println(q1.peek());
		System.out.println(q1);
		
		
		
		
		q1.clear();
		System.out.println(q1.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
