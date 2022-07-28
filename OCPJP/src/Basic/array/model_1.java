package Basic.array;

public class model_1 {
	public static void main(String[] args) {
		// not array
		int abc=123;
		int def=456;
		int ghi=789;
		
		System.out.println(abc);
		System.out.println(def);
		System.out.println(ghi);
		//-------------------------------//
		// array-1
		int[] array=new int[3];
		array[0]=123;
		array[1]=456;
		array[2]=789;
		//array-2
		int[] arrays= {123,456,789};
		
		// for loop
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for(int i=0;i<arrays.length;i++) {
			System.out.println(arrays[i]);
		}
		// for-each loop
		for(int j : array) {
			System.out.println(j);
		}
		for(int k : arrays) {
			System.out.println(k);
		}
	}
}
