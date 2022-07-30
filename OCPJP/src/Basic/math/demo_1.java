package Basic.math;

public class demo_1 { // 常用數學函數
	public static void main(String[] args) {
		// 常用常數
		System.out.println(Math.PI); // pi
		System.out.println(Math.E); // e
		// 絕對值
		System.out.println(Math.abs(-123.45)); //123.45
		
		// 弧度與角度互換
		System.out.println(Math.toRadians(30)); // 角度變弧度
		System.out.println(Math.toDegrees(30)); // 弧度變角度
		
		// 三角函數 sin(弧度),cos(弧度),tan(弧度）
		System.out.println(Math.sin(30));  //-0.9880316240928618
		System.out.println(Math.sin(Math.toRadians(30))); // 0.5  
		
		// 反三角函數 asin(弧度),acos(弧度),atan(弧度）  
		System.out.println(Math.asin(1));  // <-- 回傳值介於 -pi/2 ~ pi/2   (且別忘了 asin(0~1))
		System.out.println(Math.acos(0));	// <-- 回傳值介於 0 ~ pi        (且別忘了 acos(0~1))
		System.out.println(Math.atan(30)); // <-- 回傳值介於 -pi/2 ~ pi/2
		
		// rectangular coordinates (x, y) to polar coordinates (r, theta).
		// 語法： atan2(double y, double x)   --> 回傳 theta (double)
		System.out.println(Math.atan2(1.2, 2.4)); 
		
		// 次方計算  --> 語法：pow(double a, double b)  ，後者為次方 （回傳值為 double)
		System.out.println(Math.pow(2, 3)); // 8.0
		
		// 平方根計算
		System.out.println(Math.sqrt(25)); // 5.0  --> 5x5=25
		
		// 立方根計算 --> 語法：cbrt(double a)  --> Returns the cube root of a double value.
		System.out.println(Math.cbrt(125)); // 5.0  --> 5x5x5=125
		
		// exponential function
		System.out.println(Math.exp(1)); // 2.71828.... --> 回傳： e^x
		System.out.println(Math.expm1(1)); //1.71828....  --> 回傳： (e^x)-1
		
		// log function
		System.out.println(Math.log(Math.E)); // 1.0  --> 以 e 為底的log
		System.out.println(Math.log10(10)); // 1.0  --> 以 10 為底的log
		System.out.println((Math.log(10))/(Math.log(2)));  //--> 以2為底的 log(N)
		
		// 取極值
		System.out.println(Math.max(1.2, 2.4)); // 取出最大值
		System.out.println(Math.min(1.2, 2.4)); // 取出最小值
		
		
	}
}
