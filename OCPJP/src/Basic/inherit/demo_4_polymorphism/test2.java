package Basic.inherit.demo_4_polymorphism;

public class test2 { // 多型陣列
	public static void main(String[] args) {
		school[][] x =new school[2][];
		x[0]=new school[3];
		x[1]=new school[4]; 

		x[0][0]=new A("a1",78);
		x[0][1]=new A("a2",78);
		x[0][2]=new A("a3",78);

		x[1][0]=new B("b1",78);
		x[1][1]=new B("b2",78);
		x[1][2]=new B("b3",78);
		x[1][3]=new B("b4",78);
		
		//for-loop
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\t"+x[i]);
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\t\t"+x[i][j]+"\t"+x[i][j].show());
			}
		}
		
		// for-each
		for(school[] i:x) {
			System.out.println(i);
			for(school j:i) {
				System.out.println(j+"  "+j.show());
			}
		}
		/*

 	[[LBasic.inherit.demo_4_polymorphism.school;@6f75e721
	  [LBasic.inherit.demo_4_polymorphism.school;@69222c14
		 Basic.inherit.demo_4_polymorphism.A@606d8acf	name: a1 chi: 78
		 Basic.inherit.demo_4_polymorphism.A@782830e	name: a2 chi: 78
		 Basic.inherit.demo_4_polymorphism.A@470e2030	name: a3 chi: 78
	  [LBasic.inherit.demo_4_polymorphism.school;@3fb4f649
		 Basic.inherit.demo_4_polymorphism.B@33833882	name: b1
		 Basic.inherit.demo_4_polymorphism.B@200a570f	name: b2
		 Basic.inherit.demo_4_polymorphism.B@16b3fc9e	name: b3
		 sic.inherit.demo_4_polymorphism.B@e2d56bf	name: b4
		
		 */
		
	}
}
