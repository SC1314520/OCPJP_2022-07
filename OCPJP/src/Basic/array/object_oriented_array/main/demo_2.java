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
		
		x[0][0][0]=new demo_2_method("a1","rr");
		x[0][0][1]=new demo_2_method("a2","rr");

		x[0][1][0]=new demo_2_method("b1","rr");
		x[0][1][1]=new demo_2_method("b2","rr");
		x[0][1][2]=new demo_2_method("b3","rr");

		x[1][0][0]=new demo_2_method("c1","rr");
		x[1][0][1]=new demo_2_method("c2","rr");

		x[1][1][0]=new demo_2_method("d1","rr");
		x[1][1][1]=new demo_2_method("d2","rr");
		x[1][1][2]=new demo_2_method("d3","rr");

		x[1][2][0]=new demo_2_method("e1","rr");
		x[1][2][1]=new demo_2_method("e2","rr");
		x[1][2][2]=new demo_2_method("e3","rr");
		x[1][2][3]=new demo_2_method("e4","rr");
		
		for(demo_2_method[][] i:x) {
			for(demo_2_method[] j:i) {
				for(demo_2_method k:j) {
					System.out.println(k.show()); 
				}
			}
		}
	}
}
