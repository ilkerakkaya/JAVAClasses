package day38collectionsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		//Another usage of Iterators 
		
		List<String> list = new ArrayList <>();
		list.add("A");
		list.add("C");
		list.add("D");
		list.add("B");
		System.out.println(list);
		
		//update the list [AX, CX, DX, BX]
		
		ListIterator<String>lit=list.listIterator();
		while(lit.hasNext()) {
			Object el=lit.next();
			lit.set(el+ "X");
		}
		System.out.println(list);
		
		
		//Print the element reverse order
		/*
		 if u decide to use hasPrevious() and previous methods u have to use hasNext() and next() methods first to move to pointer to end of the list.
		 */
		
		while (lit.hasPrevious()) {
			Object el=lit.previous();
			System.out.print(el + " ");
		}

	}

}
