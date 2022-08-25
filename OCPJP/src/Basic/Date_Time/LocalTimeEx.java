package Basic.Date_Time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeEx {
	public static void main(String[] args) {
		LocalTime t1 =LocalTime.now();
		System.out.println(t1); // 12:58:13.494235
		
		LocalTime t2 =LocalTime.of(16,35,10);
		System.out.println(t2); // 16:35:10
		
		
		// 計算
		t2=t2.plusHours(1);
		t2=t2.plusMinutes(10);
		t2=t2.plusSeconds(10);
		System.out.println(t2); // 17:45:20
		
		//截斷
		System.out.println(t2.truncatedTo(ChronoUnit.HOURS)); // 17:00
		System.out.println(t2.truncatedTo(ChronoUnit.MINUTES)); // 17:45
		System.out.println(t2.truncatedTo(ChronoUnit.SECONDS)); // 17:45:20
		
		
		// 判斷
		System.out.println(t1.isBefore(t2)); // true
		System.out.println(t1.isAfter(t2)); // false
		
		// 間隔計算
		System.out.println(t1.until(t2, ChronoUnit.MINUTES)); // 281 (mins)
		System.out.println(t2.until(t1, ChronoUnit.MINUTES)); // -281 (mins)
	}
}
