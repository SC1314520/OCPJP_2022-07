package Basic.exception.second;

import java.util.Objects;

public class ex3 { // requireNonNull  Object非空判斷
	public static void main(String[] args) {
		method(null);
	}
	public static void method(Object obj) {
		//判斷是否為空
		/*
		if(obj==null) {
			throw new NullPointerException("傳遞為null");
		}
		*/
		//Objects.requireNonNull(obj);
		Objects.requireNonNull(obj, "傳遞為空"); // java.lang.NullPointerException: 傳遞為空
	}
}
