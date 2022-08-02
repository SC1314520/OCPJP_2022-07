package Basic.inherit.demo_1;

public class B extends S{
	//double chi; //共同 -->寫在父類別
	int excel; //相異
	public B(){
		super();
	}
	public B(String name,int chi,int excel) {
		super();
		this.name=name;
		this.chi=chi;
		this.excel=excel;
	}

	public void show() {
		System.out.println("name: "+name+" chi: "+chi+" excel: "+excel);
	}
}
