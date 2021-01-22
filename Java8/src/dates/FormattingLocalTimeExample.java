package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

	public static void parseTime() {
		String time = "13:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime :" + localTime);

		LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime1 :" + localTime1);
		// Custom Defined Format
		String time1 = "11*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("localTime2 :" + localTime2);
	}

	public static void main(String[] args) {
		parseTime();
	}

}
