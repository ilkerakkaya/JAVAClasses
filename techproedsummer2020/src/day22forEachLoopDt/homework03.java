package day22forEachLoopDt;

import java.util.ArrayList;
import java.util.List;

public class homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 3)By using set() method, convert E to D.
        List elements should be like A, B, C, D, and F. Print it on the console
		 */
		
		List<Character> chrList = new ArrayList<>();
		
		for (char i= 'A'; i>='A' && i<= 'F'; i++) {
			if(i=='D') continue;
			chrList.add(i);
		}
		chrList.set(3, 'D');
		System.out.println(chrList);

				
		
		
	}

}
