package Basic.Object_oriented.practice6_static.main.inner.Enum;

import java.util.Arrays;

public class demo3 {
	public static void main(String[] args) {
		Company.Month[] M=Company.Month.values();
		Company.address[] a=Company.address.values();
		Company.Week[] w=Company.Week.values();
		
		for(Company.Month i:M) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println(w); // [LBasic.Object_oriented.practice6_static.main.inner.Enum.Company$Week;@7344699f
		System.out.println(Arrays.toString(w)); // [星期一, 星期二]
		System.out.println(Arrays.toString(Company.Week.values())); // [星期一, 星期二]

	}
}
class Company{ // 內部類別會自動加入 public static
	/* public static */enum Month{
		一月,二月,三月
	}
	enum address{
		台北,台中,新竹
	}
	enum Week{
		星期一,星期二
	}
}

