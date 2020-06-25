package day20arraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// how to check if 2 arrays are equal to each other
		// if same elements have same indexes then the arrays are equal to each other
		// If arrays have different elements they cannot be equal to each other
		// in the following example arr1 is equal to arr2 but arr3 is different
		
		int arr1[]= {2,7,6};
		
		int arr2[]= {2,7,6};
		
		int arr3[]= {6, 2, 7};
		
		//1. way:using loops to check equality
		
		
		int count=0;
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i]==arr2[i]) {
				count++;
			}
		}
		
		if(count==arr1.length) {
			System.out.println("Arrays are same");
		}else {
			System.out.println("they r nor same");
		}

		
		//2nd way: equals() method
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
