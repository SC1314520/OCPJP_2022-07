package Basic.Date_Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		LocalDateTime t =LocalDateTime.now();
		System.out.println(t); // 2022-08-25T13:06:18.160229
		
		LocalDateTime t2 =LocalDateTime.of(2002,10,13,00,00,1);
		System.out.println(t2); // 2002-10-13T00:00:01
		
		
		// 計算 (未覆蓋寫法）
		System.out.println(t2.plusSeconds(1)); // 2002-10-13T00:00:02
		System.out.println(t2.plusMinutes(1)); // 2002-10-13T00:01:01
		System.out.println(t2.plusDays(1)); // 2002-10-14T00:00:01
		System.out.println(t2.plusMonths(1)); // 2002-11-13T00:00:01
		System.out.println(t2.plusYears(1)); // 2003-10-13T00:00:01
		
		
		// 時間間隔
		System.out.println(t2.until(t, ChronoUnit.MONTHS));
		
	}
}
