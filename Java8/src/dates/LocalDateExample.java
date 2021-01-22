package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : "+ localDate); // immutable
		
		LocalDate localDate1 = LocalDate.of(2018, 12, 28);
		System.out.println("localDate1 : "+ localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2016, 22);
		System.out.println("localDate2 : "+ localDate2);
		
		//get values from localDate
		System.out.println("getMonth : " +localDate.getMonth());
		System.out.println("getMonthValue : " +localDate.getMonthValue());
		System.out.println("getDayofWeek : " +localDate.getDayOfWeek());
		System.out.println("getDayOfYear : " +localDate.getDayOfYear());
		System.out.println("Day of month usng get :" +localDate.get(ChronoField.DAY_OF_MONTH));
		
		// Modifying local date
		System.out.println("plus days :" + localDate.plusDays(2));
		System.out.println("plus weeks :" + localDate.plusWeeks(2));
		System.out.println("plus months:" + localDate.plusMonths(5));
		System.out.println("change yrs:" + localDate.withYear(2017));
		System.out.println("with chronofield:" + localDate.with(ChronoField.YEAR, 2015));
		System.out.println("with TemporalAdjusters:" + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		System.out.println("minus :" + localDate.minus(1, ChronoUnit.YEARS));
		
		//check whether support or not
		System.out.println("isSupported :" + localDate.isSupported(ChronoUnit.MINUTES));
		
		//Additional support methods
		System.out.println("leap year :" + LocalDate.ofYearDay(2020, 01).isLeapYear());
		
		System.out.println("isEqual :" +localDate.isEqual(localDate1));
		System.out.println("isBefore :" +localDate.isBefore(localDate1));
		System.out.println("isAfter :" +localDate.isAfter(localDate1));
	}

}
