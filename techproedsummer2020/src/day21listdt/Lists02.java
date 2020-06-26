package day21listdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		// How to check if 2 lists are equal to each other
		
		List<Integer>l1=new ArrayList<>();
		l1.add(11);
		l1.add(12);
		System.out.println(l1);
		

		
		List<Integer>l2=new ArrayList<>();
		l2.add(12);
		l2.add(11);
		System.out.println(l2);
		
		
		
		List<Integer>l3=new ArrayList<>();
		l3.add(12);
		l3.add(11);
		System.out.println(l3);
		
		//How to check if 2 lists r equal to each other
		
		System.out.println(l1.equals(l2));
		
		System.out.println(l2.equals(l3));
		
		
		
		
		//How to convert a list to an array
		
		Integer arr[]=l1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		//How to convert a array to an list
		
		String s[]= {"A", "C", "B" };
		List<String>l4=Arrays.asList(s);
		System.out.println(l4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
