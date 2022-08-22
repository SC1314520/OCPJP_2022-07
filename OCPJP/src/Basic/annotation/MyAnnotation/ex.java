package Basic.annotation.MyAnnotation;

@SuppressWarnings("deprecation")
public class ex {
	
	// 反射來處理註解
	public static void main(String[] args) {
		Class<cat> catClass =cat.class;
		// 獲取類上應用的指定註解
		MyAnnotation annotation =catClass.getAnnotation(MyAnnotation.class);
		
		// 獲取註解上變量值
		String name=annotation.name();
		int age =annotation.age();
		Color color =annotation.color();
		String[] like =annotation.like();
		
		try {
			cat c=catClass.newInstance();
			c.setName(name);
			c.setAge(age);
			c.setLike(like);
			c.setColor(color);
			System.out.println(c);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
