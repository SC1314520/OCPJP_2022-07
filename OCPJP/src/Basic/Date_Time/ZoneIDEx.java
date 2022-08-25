package Basic.Date_Time;

import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class ZoneIDEx {
	public static void main(String[] args) {
		ZoneId z1=ZoneId.systemDefault(); // 系統預設時區
		System.out.println(z1); // Asia/Taipei
		
		ZoneId z2=ZoneId.of("Asia/Shanghai"); // 自訂時區
		System.out.println(z2); // Asia/Shanghai
		
		ZoneRules z3 =z1.getRules();
		System.out.println(z3); // ZoneRules[currentStandardOffset=+08:00]
		
	}
}
