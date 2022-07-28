package Basic.Object_oriented.practice6_static.main.plus;

public class demo_1 {
	public static void main(String[] args) {
		int numbers[] = {12,13,42,32,15,156,23,51,12};
		int sum =sum(numbers); //若要直接呼叫方法（sum)，則方法須加 static ....(1)
		int sum2=new demo_1().sum2(numbers); // 非 static 方法呼叫。
		int sum3=demo_1.sum(numbers); // 直接呼叫的第二種寫法。
		System.out.println(sum); 
		System.out.println(sum2);
		System.out.println(sum3);
	}
	static int sum(int[] numbers) { //....(1) 前置 static
		int sum=0; //切記：須賦予初始值
		for(int i:numbers) {
			sum+=i;
		}
		return sum;
	}
	int sum2(int[] numbers) {
		int sum=0; //切記：須賦予初始值
		for(int i:numbers) {
			sum+=i;
		}
		return sum;
	}
}
