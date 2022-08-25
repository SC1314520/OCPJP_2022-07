package Basic.Date_Time;

import java.time.LocalDate;

public class LocalDateEx {
	public static void main(String[] args) {
		LocalDate ld =LocalDate.now();
		System.out.println(ld); // 2022-08-25
		
		LocalDate d2 =LocalDate.of(1999,1,1);
		System.out.println(d2); // 1999-01-01
		
		// 計算日期 （注意左側須撰寫）
		d2=d2.plusDays(10);
		d2=d2.plusMonths(1);
		d2=d2.plusWeeks(1);// 7天
		d2=d2.plusYears(1);
		System.out.println(d2); // 2000-02-18
		
		// 取得資訊
		System.out.println(d2.getDayOfWeek()); // FRIDAY <-- 一週中第 5 天
		System.out.println(d2.getDayOfMonth()); // 18 <-- 一個月中第 18 天
		System.out.println(d2.getDayOfYear()); // 49  <-- 一年中第 49 天
		
		System.out.println(d2.getMonthValue()); // 2
		System.out.println(d2.getMonth()); // FEBRUARY
		System.out.println(d2.getYear()); // 2000
	}
}
