package day22forEachLoopDt;

import java.util.ArrayList;
import java.util.List;

public class homework002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        4)By using remove() method, remove F from the list.
        List elements should be like A, B, C, D. Print it on the console
        */
       
       List<Character> chrList = new ArrayList<>();
       
       for (char i= 'A'; i>='A' && i<= 'F'; i++) {
           if(i=='E') continue;
           chrList.add(i);
       }
       chrList.remove(chrList.size()-1);
       System.out.println(chrList);

	}

}
