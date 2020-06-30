package day23passbyvaluedatedt;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DayTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(date));
		
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		
		System.out.println(dtf1.format(date));
		
		//How to update time format
		
		LocalTime time=LocalTime.now();
		
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf3.format(time));
	
	
		//How to get local time
	System.out.println(LocalTime.now(ZoneId.of("Turkey")));	
	System.out.println(LocalTime.now(ZoneId.of("Japan")));
	
	}
	
	

}
