package day22forEachLoopDt;

import java.util.ArrayList;
import java.util.List;

public class odevler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(16);
		List<Integer> list2 = new ArrayList<>();
//		double sum=0;
//		for(Integer w:list) {
//			sum+=w;
//		}
//		sum = sum/list.size();
//		System.out.println(sum);
		int indx = 0;
		for(Integer w : new ArrayList<>(list)) {
			if(w%2==0) continue;
			indx = list.indexOf(w);
			list.remove(indx);
		}
		System.out.println(list);
	}

}
