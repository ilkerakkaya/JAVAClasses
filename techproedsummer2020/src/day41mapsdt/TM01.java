package day41mapsdt;

import java.util.Map;
import java.util.TreeMap;

public class TM01 {

	public static void main(String[] args) {
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(27,  "Good");
		tm.put(15,  "Bad");
		tm.put(27,  "ugly");
		tm.put(27,  "The best");
		tm.put(27,  "The worst");
		//if u use null for keys in TreeMap u get NullPointerException
		//tm.pu(null, "Woow");
		
		tm.put(11,  null);
		tm.put(13,  null);
		
		System.out.println(tm);
		
		tm.computeIfAbsent(15, k->"preety");
		System.out.println(tm);
		
		tm.computeIfAbsent(33, k->"Preety");
		System.out.println(tm);
	
	}

}
