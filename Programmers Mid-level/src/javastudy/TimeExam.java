package javastudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
	
	public static void main(String[] args) {
		
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint); // 2016-01-10T20:36:34.059
		
		//LocalDate Id1 = LocalDate.of(year, month, dayofMonth)
		  LocalDate Id1 = LocalDate.of(2012, Month.DECEMBER, 12);
		  System.out.println(Id1); // 2012-12-12
	
		  LocalTime It1 = LocalTime.of(17, 18);
		  System.out.println(It1);  //17:18
		  
		  LocalTime It2 = LocalTime.parse("10:15:30");
		  System.out.println(It2); // 10:15:30
		  
		  LocalDate theDate = timePoint.toLocalDate();
		  System.out.println(theDate);  //  2016-01-10 
		  Month month = timePoint.getMonth();
		  System.out.println(timePoint.getMonth()); // January 
		  System.out.println(month.getValue()); // 1
		  System.out.println(timePoint.getHour()); // 18
	}

}
