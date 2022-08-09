package Basic.inherit.demo_8_interfaceEx;
/*
 *  class extends class
 *  class implements interface
 *  interface extends interface
 *  
 *  implements 有強制 override 的要求。
 */
//interface: extends 可以繼承多個 interface
public interface school3 extends school4,school5{
	public void show2();
}
