package Basic.array.object_oriented_array.main;

import java.util.Arrays;

import Basic.array.object_oriented_array.method.demo_2_method;

public class demo_2 {
	public static void main(String[] args) {
		/*
		demo_2_method d =new demo_2_method("John", "Taipei");
		System.out.println(d.show());
		*/
		
		
		// 物件陣列
		
		demo_2_method[] d =new demo_2_method[3]; //--> 內部物件尚未產生，所以輸出為 null
		System.out.println(d); // [LBasic.array.object_oriented_array.method.demo_2_method;@7d6f77cc
		System.out.println(Arrays.toString(d)); // [null, null, null]          
		System.out.println(d[0]); // null
		System.out.println(d[1]); // null
		System.out.println(d[2]); // null
		
		//產生物件
		d[0]=new demo_2_method("John", "Taipei");
		d[1]=new demo_2_method("Mary", "Hsinchu");
		d[2]=new demo_2_method("Kelly", "Tainan");
		for(demo_2_method i:d) {
			System.out.println(i);
			System.out.println(i.show());
		}
		
		// 三維不對稱物件陣列
		
		demo_2_method[][][] x =new demo_2_method[2][][];
		x[0]=new demo_2_method[2][];
		x[0][0]=new demo_2_method[2];
		x[0][1]=new demo_2_method[3];
		
		x[1]= new demo_2_method[3][];
		x[1][0]=new demo_2_method[2];
		x[1][1]=new demo_2_method[3];
		x[1][2]=new demo_2_method[4];
	}
}
