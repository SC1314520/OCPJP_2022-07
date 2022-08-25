package Basic.Date_Time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.zone.ZoneOffsetTransition;

public class ZoneOffsetTransitionEx {
	public static void main(String[] args) {
		ZoneId z1 =ZoneId.systemDefault();
		LocalDateTime l1 =LocalDateTime.now();
		
		ZoneOffsetTransition zo1=z1.getRules().getTransition(l1);
		
		System.out.println(z1); // Asia/Taipei
		System.out.println(l1); // 2022-08-25T13:22:35.326033
		System.out.println(zo1); // null
	}
}
