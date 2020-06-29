package day22forEachLoopDt;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list= new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		//find the average value of all elements by using for each loop
		//For each; Average Value for 2, 4, 6 
		
		int sum = 0;
		
		for (Integer w : list) {
			sum = sum + w;
		}
		
		System.out.println(sum/list.size());
		
		//Remove all odd elements form the list 
		
		List<String>list1= new ArrayList<>();
		list1.add("Ab");
		list1.add("cd");
		list1.add("Ef");
		list1.add("gh");
		list1.add("Ij");
		
		for(String w : list1) {
			if(w.charAt(0)>='a' && w.charAt(0)<='z') {
				list1.remove(w);
			}
		}
		
		System.out.println(list1);
		
		
		//Print just first 2 elements of list
		
		
		
		int count =0;
		for(int w : list) {
			System.out.println(w);
			count++;
			if(count==2) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
