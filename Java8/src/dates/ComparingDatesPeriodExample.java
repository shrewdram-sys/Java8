package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2020, 01, 01);
		LocalDate localDate2 = LocalDate.of(2020, 12, 31);
		
		Period period = localDate.until(localDate2);
		System.out.println(period.getDays()); //30 days (31-01)
		System.out.println(period.getMonths()); //12-1
		System.out.println(period.getYears());
		
		Period period1 = Period.ofDays(10);
		System.out.println("get Days : "+ period1.getDays());
		
		Period period2 = Period.ofYears(9);
		System.out.println("get Years : "+ period2.getYears());
		System.out.println("get toTotalMonths : "+ period2.toTotalMonths());
		
		Period period3 = Period.between(localDate, localDate2);
		System.out.println("period : "+ period3.getDays()+": "+period3.getMonths() +": "
				+period3.getYears());
		
		// Period.between(LocalDate.now(), LocalDate.now());
		
	}

}
