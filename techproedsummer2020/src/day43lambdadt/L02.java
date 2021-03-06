package day43lambdadt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Ali");
		list.add("Mark");
		
		//Print distinct elements together with their length
		
		list.stream()
					.distinct()
					.sorted()
					.forEach(t->System.out.println(t+"-" +t.length()));
		
		System.out.println("================");
		//Print distinct elements, sort them according to their length
			list.stream()
			.distinct()

			.sorted(Comparator.comparing(t->t.length()))
			
			.forEach(t->System.out.println(t+ " "));
			
			System.out.println("================");
			//Print distinct elements, sort them according to their last character
			
			list.stream()
						.distinct()
						.sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
						.forEach(t->System.out.println(t+" "));
			
			System.out.println("================");
			
			
			
			//Print distcint elements in reverse order
			
			
			list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.forEach(t->System.out.println(t+" "));
			
			
			System.out.println("================");
			
			
			//Print distinct element whose length is less than 7 with upper cases in reverse order
			
			list.stream()
					.distinct()
					.filter(t->t.length()<7)
					.map(t->t.toUpperCase())
					.sorted(Comparator.reverseOrder())
					.forEach(t->System.out.println(t+" "));
			
			System.out.println("================");
			
			//Another way to see distinct elements
			
			System.out.println(list.stream()
	                   .filter(t->t.length()<7)
	                   .map(t->t.toUpperCase())
	                   .collect(Collectors.toSet()));

			
			
			
			
			
			
			
			
			
			
			
			
			
}

}
