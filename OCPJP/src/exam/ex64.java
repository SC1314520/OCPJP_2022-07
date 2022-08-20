package exam;

public class ex64 {

}
/*
How do you change the value of an instance variable in an immutable class?

A. Call the setter method
B. Remove the final modifier and set the instance variable directly
C. Create a new instance with an inner class
D. Use a method other than Option A,B, or C.
E. You can't



ans:E

*/ 
/* immutable class
	1. 不提供修改屬性內容的 setter 方法。
	2. 所有的屬性宣告為 private final 使其無法被修改。
	3. 類別宣告為 final class，使其無法被繼承、方法無法被覆寫、或是把建構子設為 private，並改以工廠方式提供物件的實例。
	4. 若屬性為 immutable object 應避免提供修改方法，讀取時提供複製物件非原物件的參照。



*/