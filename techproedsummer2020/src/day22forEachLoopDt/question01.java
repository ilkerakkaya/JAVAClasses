package day22forEachLoopDt;

import java.util.Arrays;

public class question01 {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		
		int a[]= {12, 11, 23, 7};
		
		int b[]= new int[a.length-1];
		
		int idx=1;
		int k=0;
		
		for(int i =0; i<a.length; i++) {
			if(idx==i) {
				continue;//means skip the element
			}
			
			b[k]=a[i];
			k++;
			
		}
		
		
		System.out.println(Arrays.toString(b));
	}

}
