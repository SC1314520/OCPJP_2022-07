package Basic.Object_oriented.practice4.main;

import java.util.Scanner;

import Basic.Object_oriented.practice4.method.order2_method;

public class order2 {
	public static void main(String[] args) {
		order2_method od =new order2_method();
		String name;
		int lcd,ram,mouse;
		System.out.println("訂單管理系統");
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入姓名:");
		name=sc.next();
		System.out.print("請輸入 lcd 數量:");
		lcd=sc.nextInt();
		System.out.print("請輸入 ram 數量:");
		ram=sc.nextInt();
		System.out.print("請輸入 mouse 數量:");
		mouse=sc.nextInt();
		System.out.println("姓名:"+name+" 購買: lcd :"+lcd+ " 個"+" ram :"+ram+ " 個"+" mouse :"+mouse+ " 個"+ " 總價格為:"+od.sum(lcd, ram, mouse));
	}
}
