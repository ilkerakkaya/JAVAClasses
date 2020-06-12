package Examples;

import java.util.Scanner;

public class examples01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			System.out.println("iki basamakli rakam gir");
			
			int digit=scan.nextInt();
			
			if(digit>100 || digit<10) {
				System.out.println("2 digits needed");
			}else{
				System.out.println((digit/10)+(digit%10));
			}
	}

}
