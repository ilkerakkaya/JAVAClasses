package day13wrapperscopewhiledt;

public class HomeWork02WhileLoop {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop.
		Write a program that types first 30 consecutive odd integers.
		 */
		
		int x = 1;
        System.out.println("consecutive odd numbers");
        while(x<=30){
            System.out.println(x%2==1);
           x++;
        }
		
	}

}
