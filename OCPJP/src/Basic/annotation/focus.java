package Basic.annotation;

public class focus {

}
/*
基本註解：

@Override 
	作用於子類中的方法，表示該方法一定要重寫父類中的方法，可以有效避免子類方法名誤寫錯誤；
@Deprecated 
	表示某類、方法等已過時，當它們被使用時，編譯器將會給出警告；
@SuppressWarnings 
	鎮壓警告，被修飾的程式元素及其子元素取消顯示指定的編譯器警告，supress 有抑制、廢止的含義；
@SafeVarags 
	Java 7 新增的，抑制堆汙染警告；
@FunctionalInterface：
	Java 8 中加入用於表示型別宣告為函式式介面


元註解：

@Retention
	RetentionPolicy.SOURCE 註解只在原始碼階段保留，在編譯器進行編譯時它將被丟棄忽視；
	RetentionPolicy.CLASS 註解只被保留到編譯進行的時候，它並不會被載入到 JVM 中；
	RetentionPolicy.RUNTIME 註解可以保留到程式執行的時候，它會被載入進入到 JVM 中，所以在程式執行時可以獲取到它們；

@Documented
	它的作用是能夠將註釋中的元素包含到 Javadoc 中去。

@Target
	指定了註解運用的地方，規定了只能張貼到方法上、類上、方法引數上等等。
			ElementType.TYPE 可以給一個型別進行註解，比如類、介面、列舉
			ElementType.METHOD 可以給方法進行註解
			ElementType.FIELD 可以給屬性進行註解
			ElementType.CONSTRUCTOR 可以給構造方法進行註解
			ElementType.LOCAL_VARIABLE 可以給區域性變數進行註解
			ElementType.PACKAGE 可以給一個包進行註解
			ElementType.PARAMETER 可以給一個方法內的引數進行註解
			ElementType.ANNOTATION_TYPE 可以給一個註解進行註解
@Inherited
	Inherited 是繼承的意思，但是它並不是說註解本身可以繼承，
	而是說如果一個超類被 @Inherited 註解過的註解進行註解的話，
	那麼如果它的子類沒有被任何註解應用的話，那麼這個子類就繼承了超類的註解。


提取註解資訊：
	getAnnotation(Class<T> annotationClass) 返回該程式元素上指定型別的註釋，如果不存在，則返回 null。
		比如 Length length = field.getAnnotation(Length.class); 
		通過反射獲取到該欄位上使用的 @Length 註解的詳細資訊；
		
	Annotation[] getAnnotations() 返回該程式元素上的所有註釋
		例如 Annotation annotations = Class.forName("Test").getMethod("info").getAnnotations(); 
		表示獲取 Test 類中 info 方法上的註釋；
		
	boolean isAnnotatinPresent(Class<?extends Annotation> annotationClass) 判斷該元素上是否存在指定型別的註釋，如果存在則返回 true，否則返回 false，
		例如 methodA.isAnnotationPresent(Length.class)，
		表示判斷方法 methodA 上是否用了 @Length註釋；
	
	

*/