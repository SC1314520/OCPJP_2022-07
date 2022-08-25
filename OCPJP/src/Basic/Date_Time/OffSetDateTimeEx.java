package Basic.Date_Time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class OffSetDateTimeEx {
	public static void main(String[] args) {
		LocalDateTime meeting =LocalDateTime.of(2016,07,10,11,30);
		ZoneId taipei =ZoneId.systemDefault();
		
		ZonedDateTime host =ZonedDateTime.of(meeting, taipei);
		System.out.println(host); // 2016-07-10T11:30+08:00[Asia/Taipei]
		
		OffsetDateTime offset =host.toOffsetDateTime();
		System.out.println(offset); // 2016-07-10T11:30+08:00
		
		
		
		ZoneId london =ZoneId.of("Europe/London");
		ZonedDateTime z1=offset.atZoneSameInstant(london);
		System.out.println(z1); // 2016-07-10T04:30+01:00[Europe/London]
	}
}
