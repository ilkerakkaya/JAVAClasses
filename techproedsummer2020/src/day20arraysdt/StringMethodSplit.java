package day20arraysdt;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i like to move it move it";
		
		String t[]=s.split("move");
		
		System.out.println(Arrays.toString(t));
	
		
		//how to count the number of the words
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter String");
		
		String w=scan.nextLine();
		
		String y[]= w.split(" ");
		System.out.println(Arrays.toString(y));
		System.out.println(y.length);
		
		scan.close();
	}

}
