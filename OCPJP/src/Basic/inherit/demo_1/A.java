package Basic.inherit.demo_1;

public class A extends S{
	//double chi; //共同 -->寫在父類別
	int word; //相異
	public A(String name,int chi,int word) {
		super();
		this.name=name;
		this.chi=chi;
		this.word=word;
	}
	public void show() {
		System.out.println("name: "+name+" chi: "+chi+" word: "+word);
	}
}

