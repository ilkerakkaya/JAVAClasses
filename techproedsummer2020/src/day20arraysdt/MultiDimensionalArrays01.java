package day20arraysdt;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// if the elements of an array are Arrays then the array is called  multidimensional array.
		
		//How to create dimensional array?
		
		int mda[][]=new int [3][2];
		
		//how to print multidimensional array
		
		System.out.println(Arrays.deepToString(mda));
		
		
		
		//how to add elements into a MDA
		
		mda [0][0]=5;
		System.out.println(Arrays.deepToString(mda));
		mda [0][1]=6;
		System.out.println(Arrays.deepToString(mda));


		
		mda [1][0]=7;
		System.out.println(Arrays.deepToString(mda));
		mda [1][1]=8;
		System.out.println(Arrays.deepToString(mda));
		
		
		mda [2][0]=9;
		System.out.println(Arrays.deepToString(mda));
		mda [2][1]=11;
		System.out.println(Arrays.deepToString(mda));
		
		
		
		
		//how to print an element outer array
		
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		
		
		//how to print the elements of inner array one by one
		
		System.out.println(mda[0][1]);
		
		System.out.println(mda[0][1]);
		
		
		//how to create multidimensional array in short way
		
		int mda1[][]= {{3,4,5}, {6}, {7,8}};
		System.out.println(Arrays.deepToString(mda));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
