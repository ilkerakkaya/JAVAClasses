package day20arraysdt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// How to check if a specific element is in the array
		int arr[]= {5,2, 4, 3, 5};
		
		//before using binary search method u must use sort method otherwise binaryseacrh returns wrong index.
		//BinarySearch() method returns the index of element which u r looking for 
		//if u look for a non-existing element in an Array u will get negative result
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch(arr, 4));
		System.out.println(Arrays.binarySearch(arr, 5));
		
		System.out.println(Arrays.binarySearch(arr, 7));
		System.out.println(Arrays.binarySearch(arr, 0));
	}

}
