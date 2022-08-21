package solve;

// ch3 ex2 ex9


class superT{
	public Number length() { // 父
		return 10;
	}
}

class subT extends superT{
	// super 父 sub 子 可以覆寫。  --> 顛倒則不可！！
	@Override
	public Integer length() { // 子
		return 20;
	}
}


public class impl_super_sub {
	public static void main(String[] args) {
		
	}
}
