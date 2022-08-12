package Basic.Collections.List.ArrayList.demo8;

import java.util.ArrayList;


public class method {
	ArrayList<Integer> list2 =new ArrayList<>();
    ArrayList<Integer> list3 =new ArrayList<>();
	static ArrayList<Integer> list4 =new ArrayList<>();

	public method() {
		
	}

	public void multi(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				this.list2.add(list.get(i));
			}
			else {
				continue;
			}
		}
		System.out.println("list2: "+list2+" size: "+list2.size());
	}
	
	public ArrayList<Integer> analyze(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				this.list3.add(list.get(i));
				
			}
			else {
				continue;
			}
		}
		return list3;
	}
	
	public static void even(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				list4.add(list.get(i));
			}
			else {
				continue;
			}
		}
		System.out.println("list4: "+list4+" size: "+list4.size());
	}
	
}
