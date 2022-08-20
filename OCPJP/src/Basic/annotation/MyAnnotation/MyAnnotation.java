package Basic.annotation.MyAnnotation;
/* 註釋：
 *  步驟：
 * 		1. 邊寫註解
 * 		2. 在類上應用註解
 * 		3. 對應用了註解的類進行反射操作的類
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 用於生成文檔
@Documented // 註釋(/* */)在生成 doc 文件時依舊存在。
// 表示該註解的作用範圍在運行時存在
@Retention(RetentionPolicy.RUNTIME) // 表示該註解的作用範圍在運行時還存在
// 用於表示註解的應用範圍（類型、方法、屬性、建構子、參數、局部變量、包、註解）
@Target(ElementType.TYPE) // 在類上可以使用 （註解寫的位置不同）
@Inherited // 表示子類可以繼承註解
public @interface MyAnnotation {
	// 定義變量
	public String name();
	public int age() default 2; // 給予默認值
	public String[] like(); // 定義一個陣列變量
	public Color color();  // 定義一個 enum 類型的變量  --> 限制範圍
}
