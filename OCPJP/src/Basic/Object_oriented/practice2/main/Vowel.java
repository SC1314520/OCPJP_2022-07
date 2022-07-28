package Basic.Object_oriented.practice2.main;

public class Vowel {
	private char var;
	public static void main(String[] args) {
		char var1='a';
		char var2=var1; // 此時 var2='a';
		var2='e'; // 覆蓋： var2='e';
		
		Vowel obj1=new Vowel();
		Vowel obj2=obj1; // 將 obj2 記憶體位置指向 obj1 --> 兩者同為一物。
		obj1.var='i'; // 此時兩者的 var='i';
		obj2.var='o'; // 覆蓋： 兩者 var='o';
		
		System.out.println(var1+","+var2); // a,e
		System.out.println(obj1.var+","+obj2.var); // o,o
		
		System.out.println(obj1==obj2); // 因為記憶體位置相同，所以答案為 true。
		
	}
}
