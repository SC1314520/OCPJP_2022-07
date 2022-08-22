package Basic.annotation_2;

import java.util.ArrayList;
import java.util.List;

class book1{
	@Deprecated
	public void show1() {
		System.out.println("hello book1");
	}
}

class bookStore1 extends book1{
	
	@Override  // 檢查是否覆寫父類別方法。
	public void show1() {
		
	}
}

class ProjectPlanner<T>{
	public ProjectPlanner create(T t) {
		return this;
	}
}

@FunctionalInterface  // 只能有一個抽象方法
interface len{
	public abstract void sum();
}

public class ex1 {
	public static void main(String[] args) {
		new book1().show1(); //  還是可以使用！！
		
		new bookStore1().show1();
		
		@SuppressWarnings("rawtypes")
		List list =new ArrayList(); // rawtypes 也可以解決泛型為宣告的問題。  
		
		@SuppressWarnings({"rawtypes","unused"})
		List list2 =new ArrayList();
		// 在单个泛型代码上添加@SuppressWarning("rawtypes")可以跳过泛型检查，但是需要注意： 还需要在方法上添加 @SuppressWarning("unchecked")注释
		
		@SuppressWarnings({"rawtypes", "unchecked"})
		ProjectPlanner planner =new ProjectPlanner().create("TPS");   // unchecked 是針對 create（"TPS") 的部分。
		
		System.out.println(list);
	}
 
}
/*
 
all，抑制所有警告
boxing，抑制與封裝/拆裝作業相關的警告
cast，抑制與強制轉型作業相關的警告
dep-ann，抑制與淘汰註釋相關的警告
deprecation，抑制與淘汰的相關警告
fallthrough，抑制與 switch 陳述式中遺漏 break 相關的警告
finally，抑制與未傳回 finally 區塊相關的警告
hiding，抑制與隱藏變數的區域變數相關的警告
incomplete-switch，抑制與 switch 陳述式 (enum case) 中遺漏項目相關的警告
javadoc，抑制與 javadoc 相關的警告
nls，抑制與非 nls 字串文字相關的警告
null，抑制與空值分析相關的警告
rawtypes，抑制與使用 raw 類型相關的警告
resource，抑制與使用 Closeable 類型的資源相關的警告
restriction，抑制與使用不建議或禁止參照相關的警告
serial，抑制與可序列化的類別遺漏 serialVersionUID 欄位相關的警告
static-access，抑制與靜態存取不正確相關的警告
static-method，抑制與可能宣告為 static 的方法相關的警告
super，抑制與置換方法相關但不含 super 呼叫的警告
synthetic-access，抑制與內部類別的存取未最佳化相關的警告
sync-override，抑制因為置換同步方法而遺漏同步化的警告
unchecked，抑制與未檢查的作業相關的警告
unqualified-field-access，抑制與欄位存取不合格相關的警告
unused，抑制與未用的程式碼及停用的程式碼相關的警告

*/