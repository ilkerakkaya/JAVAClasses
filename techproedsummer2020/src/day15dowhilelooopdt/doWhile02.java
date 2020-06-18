package day15dowhilelooopdt;

public class doWhile02 {

	public static void main(String[] args) {
		// Print first 10 counting numbers on the console by using do-while loop

		int i=1;
		
		do {
			System.out.println(i + " ");
			i++;
		}while(i<=10);
		
		
		
		
		
		
		//print first 5 even numbers on the console
		
		
		int j=1;
		
		do {
			if(j%2==0) {
				System.out.println(j + " ");
				
			}
			j++;
		}while(j<=10);
		
		
		
		
		
		
		
		//print divisible by 3 less than 100
		
int k=1;
		
		do {
			if(k%3==0) {
				System.out.println(k + " ");
				
			}
			k++;
		}while(k<100);
		
	}
	

}
