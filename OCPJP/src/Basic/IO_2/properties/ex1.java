package Basic.IO_2.properties;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 *  Properties 集合 extends Hashtable<K,V> implements Map<K,V>
 *  唯一和 I/O 流 相結合的集合。
 * 		store: 把集合中的臨時數據，持久化寫入磁碟中存儲。
 * 		Load: 可以把磁碟中保存的文件（鍵值對），讀取到集合中使用。
 * 	
 * 		key,value 皆為 String 類型。
 * 		
 * 		Object setProperty(String key,String value) 調用 Hashtable 的方法 put。
 * 		String getProperties(String key) 通過 key 找到 value 值，此方法相當於 Map 集合中的 get(key) 方法。
 * 		Set<String> stringPropertyNames() 返回此屬性列表中的 key 集，此方法相當於 Map 集合中的 keySet() 方法。
 */

public class ex1 {
	public static void main(String[] args) throws IOException {
		//show1();
		//show2();
		//show3();
		//show4();
		show5();
	}
	public static void show1() {
		Properties prop =new Properties();
		// 預設為 <String,String>
		prop.setProperty("aaa", "168");
		prop.setProperty("bbb", "165");
		prop.setProperty("ccc", "162");
		//prop.put(1, "hello"); --> 不指定類型 也可以這樣寫。
		
		Set<String> set =prop.stringPropertyNames();
		for(String key:set) {
			System.out.println(key);
			System.out.println(prop.getProperty(key));
		}
	}
	public static void show2() throws IOException {
		/* void store(OutputStream out ,String comments)
		   void store(Writer writer ,String comments)
		   參數：
		   		OutputStream out：字節輸出流，可以寫中文。
		   		Writer writer : 字符輸出流，可以寫中文。
				String comments : 註釋，用來說明保存的文件用途。不可寫中文。
		   步驟：
		   		1. 創建 Properties 集合對象，添加數據。
		   		2. 創建輸出流，構造方法中綁定輸出的目的地。
		   		3. 使用 Properties 集合中的方法 store，把集合中的臨時數據，持久話寫入到硬盤中存儲。
				4. 釋放資源
		*/
		Properties prop =new Properties();
	
		prop.setProperty("John", "168");
		prop.setProperty("Mary", "165");
		prop.setProperty("Kelly", "162");
		
		FileWriter fw =new FileWriter("/Users/blc0000421gmail.com/Desktop/io/a.txt");	
		prop.store(fw, "sava data");
		fw.close();
	
	}
	public static void show3() throws IOException {
		Properties prop =new Properties();
		
		prop.setProperty("John", "168");
		prop.setProperty("Mary", "165");
		prop.setProperty("Kelly", "162");
		
		
		prop.store(new FileOutputStream("/Users/blc0000421gmail.com/Desktop/io/b.txt"), "save data");
		
	}
	
	public static void show4() throws IOException {
		/*
		 	void load(InputStream inStream)
		 	void load(Reader reader)
		 */
		Properties prop =new Properties();
		prop.load(new FileReader("/Users/blc0000421gmail.com/Desktop/io/b.txt"));
		
		Set<String> set =prop.stringPropertyNames();
		for(String key:set) {
			System.out.println(key);
			System.out.println(prop.get(key));
		}
	}
	
	public static void show5() throws IOException {
		Properties prop =new Properties();
		prop.load(new FileInputStream("/Users/blc0000421gmail.com/Desktop/io/a.txt")); //讀取中文時會出錯
		
		Set<String> set =prop.stringPropertyNames();
		for(String key:set) {
			System.out.println(key);
			System.out.println(prop.get(key));
		}
	}
}
