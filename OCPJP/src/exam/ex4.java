package exam;

public class ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(10);
		System.out.println(sb.length()); // 0
		sb.append("HOWDY"); //HOWDY
		System.out.println(sb.length()); // 5
		sb.insert(0,' ');  // HOWDY
		System.out.println(sb.length()); // 6
		
		sb.replace(3,5,"LL"); // HOLLY
		System.out.println(sb.length()); // 6
		
		sb.insert(6,"COW");// HOLLYCOW
		System.out.println(sb.length()); // 9
		sb.delete(2,7); // HOW
		System.out.println(sb.length()); // 4
		

	}
}
