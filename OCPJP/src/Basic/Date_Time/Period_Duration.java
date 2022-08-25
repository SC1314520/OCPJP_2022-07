package Basic.Date_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Period_Duration {
	public static void main(String[] args) {
		LocalDateTime day1 = LocalDateTime.of(2021,10,25,8,40);
		ZonedDateTime t =ZonedDateTime.of(day1,ZoneId.systemDefault());
		
		System.out.println(t); // 2021-10-25T08:40+08:00[Asia/Taipei]
		
		Period dayPeriod = Period.ofDays(2);
		Period monthPeriod =Period.ofMonths(1);
		System.out.println(t.plus(dayPeriod)); // 2021-10-27T08:40+08:00[Asia/Taipei]
		System.out.println(t.plus(monthPeriod)); // 2021-11-25T08:40+08:00[Asia/Taipei]
		
		
		
		Duration day=Duration.ofDays(2); // Duration 最大單位只到 Day
		System.out.println(t.plus(day)); // 2021-10-27T08:40+08:00[Asia/Taipei]
		
	}
}
