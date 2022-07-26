package Basic.switchs;

public class demo_3 {
	public static void main(String[] args) {
		/*
		 * final:
		 * 	類別：當宣告在類別上時，該類別就無法被繼承！
		 * 	函數：當一個函數被宣告為final時，則繼承他的子類別無法覆寫
		 * 	變數：當一個變數被宣告為final時，意思是他是一個常數，是無法被修改的。
		 */
		final int a = 1;  // case 判定值須 final -->constant (不可中途更動）
        final int b = 2;  // case 判定值須 final -->constant (不可中途更動）
        int x = 0;

        switch (x) {
            case a:
            	
            	break;     
            case b:
            	
            	break;     

        }
	}
}
