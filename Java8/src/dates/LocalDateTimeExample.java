package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localdt = LocalDateTime.now();
		System.out.println("localDT :" + localdt);
		
		LocalDateTime localdt1 = LocalDateTime.of(2020,03,21,23,33,33,978);
		System.out.println("localDT1 :" + localdt1);
		
		LocalDateTime localdt2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDT2 :" + localdt2);
		
		// getting the time and date from LocalDateTime instance
		
		System.out.println("hour: "+ localdt.getHour());
		System.out.println("minute : "+ localdt.getMinute());
		System.out.println("getDayOfMonth : "+ localdt.getDayOfMonth());
		System.out.println("DAY_OF_MONTH : "+ localdt.get(ChronoField.DAY_OF_MONTH));
		
		// modifying local date time
		System.out.println("plus hours : " + localdt.plusHours(2));
		System.out.println("minusDays : " + localdt.minusDays(2));
		System.out.println("withMonth : " + localdt.withMonth(12));
		
		// converting localdate and localtime and viceversa
		LocalDate localDate = LocalDate.of(2019,01,01);
		System.out.println("atTime :" + localDate.atTime(23,33));
		
		LocalTime localTime = LocalTime.of(23, 39);
		System.out.println("atDate: " +localTime.atDate(localDate));
		
		LocalDateTime localDt3 = localTime.atDate(localDate);
		System.out.println("toLocalDate :" + localDt3.toLocalDate());
		System.out.println("toLocalDate :" + localDt3.toLocalTime());

	}

}
