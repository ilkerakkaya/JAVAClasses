package day22forEachLoopDt;

public class ForEachLoop01 {

	public static void main(String[] args) {
		// 1-) For each Loop works with collections (Array, List)
		// 2-) The other name of for each loop is enhanced loop
		
		int arr[]= {1, 2, 3, 4, 5};
		
		for (int w : arr) {
			System.out.print(w + " ");
		}
		
		// Find the sum of all elements
		
		int sum=0;
		for(int w : arr) {
			sum=sum+w;
		}
		System.out.println(sum);
		
		
		//Print the even elements 
		
		
		for (int w : arr) {
			if(w%2==0) {
				System.out.println(w + " ");
			}

			
		
			

//		for (int w : arr) {
//			if(w%2!=0) {
//				continue;
//			}
//			
//			System.out.println(w + " ");
			
			
			
			
		//Find the multipication of odd elemenets
			
			int product =1;
			for(int w : arr) {
				if(w%2==0) {
					continue;
				}
				
				product=product*w;
			}
			
			System.out.println(product);
			
			
			
			//Find the sum off all elements except 3
			
			int sum1=0;
			for(int w : arr) {
				if(w==3) {
					continue;
				}
			sum1=sum1+w;
			}
			System.out.println(sum1);
			
			
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//		
			
		}

	}
}

