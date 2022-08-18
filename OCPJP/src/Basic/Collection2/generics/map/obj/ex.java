package Basic.Collection2.generics.map.obj;

import java.util.ArrayList;

public class ex {
	public static void main(String[] args) {

		ArrayList<student> list =new ArrayList<>();
		list.add(new student("a1", 10, 50));
		list.add(new student("b1", 20, 60));
		list.add(new student("c1", 30, 70));
		list.add(new student("d1", 40, 80));
		
		for(student o:list) {
			o.show();
		}
	}
	
}
