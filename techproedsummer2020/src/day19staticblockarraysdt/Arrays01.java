package day19staticblockarraysdt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// How to create an Array
		
		int arr[]=new int[4];
		
		
		//how to create array on console
		System.out.println(Arrays.toString(arr));
		
		
		//how to assign a value on a specific element of an array
		arr[0]=11;
		System.out.println(Arrays.toString(arr));
		
		
		arr[3]=14;
		System.out.println(Arrays.toString(arr));
		
		
		arr[1]=12;
		System.out.println(Arrays.toString(arr));
		
		arr[2]=13;
		System.out.println(Arrays.toString(arr));
		
		
		
		//how to get number of elements in an array
		System.out.println(arr.length);

		
		
		//in string when we use length we need parentheses but in array there is no parentheses
		
		
		
		//How to create an array in short way
		
		int brr[]= {21, 22, 23, 24};
		System.out.println(Arrays.toString(brr));
		
		
		
		
		//what happens if u rry to use non-existing index in an array?
		//answer: u dont get compile time error
				// u get run time error
		//brr[4]=25;
		
		
		
		// how to print a specific element on the console
		
		System.out.println(brr[0]);
		System.out.println(brr[1]);
		System.out.println(brr[2]);
		System.out.println(brr[3]);
		
		
		//how to print all elements by using loop on the console
		for(int i=0; i<brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
