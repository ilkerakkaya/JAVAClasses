package day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LL01 {

	public static void main(String[] args) {
		
		/*
		 addFirst() adds the element at the beginning of linked list	
		 
		  */
		
		LinkedList <String> sll=new LinkedList <>();
		sll.add("A");
		sll.addFirst ("B");
		sll.addFirst("C");
		sll.add("B");
		sll.add("B");
		System.out.println(sll);
		
		//addLast() adds the element at the end of Linked List
		sll.addLast("N");
		System.out.println(sll);
		
		
		//getFirst() gets the first element from the list
		
		System.out.println(sll.getFirst());
		
		
		
		//getLast ()  gets the last element from the list
		System.out.println(sll.getLast());
		
		
		//Collections.sort () puts the elements in natural element order.
		Collections.sort(sll);
		System.out.println(sll);
		
		
		//Clear() removes all elements
//		sll.clear();
//		System.out.println(sll);
		
		
		//contains () method check if a specific element exist in the list
		
		sll.contains("N");
		System.out.println(sll.contains("N"));
		
		
		//element () Retrieves and does not removes the head (first element) of this list
		// if there is no first element u will get NoSuchElement
		System.out.println(sll.element());
		
		
		System.out.println(sll.get(2));
		
		
		sll.removeFirstOccurrence("B");
		System.out.println(sll);
		
		sll.removeLastOccurrence("B");
		System.out.println(sll);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
