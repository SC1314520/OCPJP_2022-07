package exam;
class DNASynth{
	int aCount;
	int tCount;
	int cCount;
	int gCount;
	
	DNASynth(int aCount,int tCount,int c,int g){
		// line 1
		tCount=tCount;
		cCount=setCCount(c);
		//setCCount(c)=cCount;
		aCount=aCount;
		setGCount(g);
	}
	int setCCount(int c){
		return c;
	}
	void setGCount(int gCount){
		this.gCount=gCount;
	}
}
public class ex16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DNASynth d=new DNASynth(1,2,3,4);
		System.out.println(d.tCount);
		System.out.println(d.cCount);
		System.out.println(d.aCount);
		System.out.println(d.gCount);

	}
}

/*
Which two lines of code when inserted in line 1 correctly modifies instance variables?

A) tCount=tCount;
B) cCount=setCCount(c);
C) setCCount(c)=cCount;
D) aCount=aCount;
E) setGCount(g);


ans:BE
*/