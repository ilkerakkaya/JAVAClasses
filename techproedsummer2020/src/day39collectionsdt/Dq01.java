package day39collectionsdt;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {
	
	/*
	 Deque: Double Ended Queue is an interface
	 
	 Note: For Queue's you can add new elements to the end of the Queue but for Deque 
	       you can add elements to the end and to the beginning.
	       
	       For Queue's you can remove elements from the beginning of the Queue but for Deque
	       you can remove elements from the beginning and from the end of the Deque
	 */

	
	

	public static void main(String[] args) {
		
		Deque<String>dq=new LinkedList<>();
		
		dq.add("Chris");
		dq.add("Ali");
		dq.add("Brandon");
		dq.add("Angie");
		dq.add("Tucker");
		System.out.println(dq);
		
		
		dq.addFirst("XXX");
		System.out.println(dq);
		
		dq.addLast("ZZZ");
		System.out.println(dq);
		
		dq.removeFirst();
		System.out.println(dq);
		
		
		dq.removeLast();
		System.out.println(dq);
	}

}
