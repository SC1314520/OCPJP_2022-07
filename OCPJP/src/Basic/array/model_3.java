package Basic.array;

import Basic.array.method.model_3_method;

public class model_3 {
	public static void main(String[] args) {
		model_3_method[] planets= {
				new model_3_method("Mercury", 0),
				new model_3_method("Venus", 0),
				new model_3_method("Earth", 1),
				new model_3_method("Mars", 2)
		};
		System.out.println(planets); // 輸出記憶體位置 : [LBasic.array.method.model_3_method;@7ad041f3
		System.out.println(planets[2]); // 輸出記憶體位置 : Basic.array.method.model_3_method@251a69d7
		System.out.println(planets[2].moons); //輸出：1 
	}
}
