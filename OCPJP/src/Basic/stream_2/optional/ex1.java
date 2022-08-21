package Basic.stream_2.optional;

import java.util.Optional;

public class ex1 {
	
	public static void main(String[] args) {
		Girl girl =new Girl();
		// girl=null; // java.lang.NullPointerException
		Optional<Girl> optionalGirl= Optional.of(girl);  // Optional.of() 內部不可放 null。
	    System.out.println(optionalGirl); // Optional[Girl [name=null]]
		
	    
	    girl=null;
		Optional<Girl> optionalGirl2= Optional.ofNullable(girl);  // Optional.ofNullable() 內部可放 null。
		System.out.println(optionalGirl2); // Optional.empty
		Girl girl1= optionalGirl2.orElse(new Girl("貂蟬")); // 如果當前的 Optional 內部封裝的為非空，則返回內部資料。若為空，則返回 orElse() 方法中的參數！！
		System.out.println(girl1); // Optional.empty
		
		
		Optional<Girl> optionalGirl3= Optional.empty();  // 創建空集合。
		System.out.println(optionalGirl3); // Optional.empty
		
		Boy boy=new Boy();
		String girlName=  getGirlName3(boy); // java.lang.NullPointerException
		System.out.println(girlName);  // 大美女
	}
	
	
	
	public static String getGirlName(Boy boy) {
		return boy.getGirl().getName();
	}
	
	// 優化
	public static String getGirlName2(Boy boy) {
		if(boy!=null) {
			Girl girl=boy.getGirl();
			if(girl!=null) {
				return girl.getName();
			}
		}
		return null;
	}
	
	// optional
	public static String getGirlName3(Boy boy) {
		
		Optional<Boy> boyOptional = Optional.ofNullable(boy);
		Boy boy1=boyOptional.orElse(new Boy(new Girl("小美女")));
		
		Girl girl=boy1.getGirl();
		
		Optional<Girl> girlOptional=Optional.ofNullable(girl);
		Girl girl1=girlOptional.orElse(new Girl("大美女"));
		
		return girl1.getName();
	}
}
