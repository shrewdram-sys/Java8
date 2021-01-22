package dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(7, 20);
		
		LocalTime localTime1 = LocalTime.of(8, 20);
		
		long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
		System.out.println("diff : "+ diff);
		
		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("toMinutes : " + duration.toMinutes());
		
		Duration duration2 = Duration.ofHours(3);
		System.out.println("Hour to minute :"+ duration2.toMinutes());
		
	}

}
