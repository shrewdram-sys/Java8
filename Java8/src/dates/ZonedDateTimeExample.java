package dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime : "+ zonedDateTime);
		
		System.out.println("zonedOffset : "+ zonedDateTime.getOffset());
		
		System.out.println("Zone Id : "+ zonedDateTime.getZone()); 
		
//		ZoneId.getAvailableZoneIds().stream()
//		.forEach(System.out::println);
		
		System.out.println("No of zones : "+ZoneId.getAvailableZoneIds().size());
		
		//setting zone
		System.out.println("Asia zone time" + ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
		
		System.out.println("Asia zone time" + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
		System.out.println("Chicago time : "+ localDateTime);
		
		// convert localdatetime, instant to ZonedLocalDate time
		LocalDateTime localDateTime3 = LocalDateTime.now();
		System.out.println("localDateTime3 : "+ localDateTime3);
		
		ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime1 : "+ zonedDateTime1);
		
		ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));
		System.out.println("zonedDateTime2 : "+ zonedDateTime2);
		
		
	}

}
