package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalDateExample {

	public static void main(String[] args) {
		// java.util.date to LocalDate and viseversa
		Date date = new Date();
		System.out.println("date :" + date);

		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("localDate :" + localDate);
		
		Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("date1 :" + date1);
				 
	}

}
