package Practice_day_02;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String title = scan.next();

		
		
		String qa = "Quality Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";
		String jobTitle = "Your job title is: ";
		
		
		if (title.equalsIgnoreCase("qa")) {
			System.out.println(jobTitle + qa);
		} else if (title.equalsIgnoreCase("dev")) {
			System.out.println(jobTitle + dev);
		} else if (title.equalsIgnoreCase("ba")) {
			System.out.println(jobTitle + ba);
		} else if (title.equalsIgnoreCase("pm")) {
			System.out.println(jobTitle + pm);
		} else {
			System.out.println("not correct");
		}


	}

}
