package Basic.array.object_oriented_array.main;

import java.util.Scanner;

import Basic.array.object_oriented_array.method.demo_1_method;

public class demo_1 {
	public static void main(String[] args) {
		demo_1_method[] d = {
				new demo_1_method("John",1,"S101"),
				new demo_1_method("Mary",2,"S101"),
				new demo_1_method("Kelly",3,"S101"),
		};
		System.out.println(d); //[LBasic.array.object_oriented_array.method.demo_1_method;@7ad041f3
		for(demo_1_method i:d) {
			//System.out.println(i);  
			/*  --> 方法無覆寫 toString()
			 	Basic.array.object_oriented_array.method.demo_1_method@251a69d7
				Basic.array.object_oriented_array.method.demo_1_method@7344699f
				Basic.array.object_oriented_array.method.demo_1_method@6b95977
			 */
			System.out.println(i);
			/*  --> 方法有覆寫 toString()
		 		demo_1_method [name=John, num=1, classroom=S101]
				demo_1_method [name=Mary, num=2, classroom=S101]
				demo_1_method [name=Kelly, num=3, classroom=S101]
			*/
		}
		//-------------------------------------------------//
		for(demo_1_method i:d) { //元素拆分個別印出
			System.out.println(i.getName());  
			System.out.println(i.getNum());
			System.out.println(i.getClassroom());
		}
		//-------------------- 手動輸入法 Setter & Getter ---------------------------//
		demo_1_method[] d2 = new demo_1_method[3];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<3;i++) {
			demo_1_method s=new demo_1_method();
			System.out.print("請輸入姓名：");
			s.setName(sc.next());
			System.out.print("請輸入座號：");
			s.setNum(sc.nextInt());
			System.out.print("請輸入班級：");
			s.setClassroom(sc.next());
			d2[i]=s;
		}
		for(demo_1_method j:d2) { 
			System.out.println(j.toString());
		}
		for(demo_1_method j:d2) {  //元素拆分個別印出
			System.out.println(j.getName());
			System.out.println(j.getNum());
			System.out.println(j.getClassroom());
		}
		
		
	}
	
	
}
