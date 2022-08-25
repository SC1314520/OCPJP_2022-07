package Basic.Date_Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZoneDateTimeEx {
	public static void main(String[] args) {
		LocalDateTime t1 =LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
		System.out.println(t1); // 2022-08-25T13:27
		
		ZonedDateTime z1 =ZonedDateTime.now().truncatedTo(ChronoUnit.MINUTES);
		System.out.println(z1); // 2022-08-25T13:28+08:00[Asia/Taipei]
		
		
		ZoneId z =ZoneId.of("America/Chicago");
		ZonedDateTime z2=ZonedDateTime.now(z).truncatedTo(ChronoUnit.MINUTES);
		System.out.println(z2); // 2022-08-25T00:31-05:00[America/Chicago]
		
		
		System.out.println(z1.getOffset()); // +08:00
		System.out.println(z2.getOffset()); // -05:00
		
		System.out.println(z1.getZone()); // Asia/Taipei
		
		
		ZonedDateTime z3=ZonedDateTime.of(t1,z); // LocalDateTime,ZoneId
		System.out.println(z3); // 2022-08-25T13:34-05:00[America/Chicago]
		System.out.println(z3.plusDays(1).minusDays(1)); // 加一減一
		
	}
}
