package Basic.annotation.MyAnnotation;

import java.util.Arrays;

// @MyAnnotation(name="bin",age=4,like={},color=)  -> 有給默認值可以省略 age
@MyAnnotation(name="bin",like= {"金魚","鯉魚","吳郭魚"},color =Color.GREEN)
public class cat {
	private String name;
	private int age;
	private Color color;
	private String[] like;
	
	public String[] getLike() {
		return like;
	}
	public void setLike(String[] like) {
		this.like = like;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "cat [name=" + name + ", age=" + age + ", color=" + color + ", like=" + Arrays.toString(like) + "]";
	}


}
