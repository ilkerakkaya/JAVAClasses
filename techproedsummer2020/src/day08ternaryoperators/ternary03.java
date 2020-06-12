package day08ternaryoperators;

import java.util.Scanner;

public class ternary03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter to integers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if(num1<=num2){
            System.out.println("min number is  : " + num1);
        }else {
            System.out.println("max number is  " + num2);
        }
		
		
		
		int result= num1<=num2 ? num1 : num2;
		System.out.println(result);
		
		scan.close();

	}

}
