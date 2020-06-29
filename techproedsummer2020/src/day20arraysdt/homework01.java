package day20arraysdt;

import java.util.ArrayList;
import java.util.List;

public class homework01 {

	public static void main(String[] args) {
		// 1)Create a String list whose elements are A, C, E, and F. Print it on the console.
		

	List<String>strList=new ArrayList<>();
	String arr []= {"A", "C", "E", "F"};
	
	for (String i: arr) {
		strList.add(i);
	}
	System.out.println(strList);
	
	
	}

}
