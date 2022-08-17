package Basic.stream_2.end;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ex {
	public static void main(String[] args) {
		ArrayList<String> one = new ArrayList<>();
		one.add("aaa");
		one.add("bbb");
		one.add("ccc");
		one.add("ddd");
		one.add("ee");
		one.add("ff");
		one.add("ggg");
		Stream<String> oneStream=
		one.stream().filter(name->name.length()==3).limit(3);
		
		ArrayList<String> two = new ArrayList<>();
		two.add("張一二");
		two.add("古三四");
		two.add("趙雲");
		two.add("張天愛");
		two.add("張二狗");
		two.add("尼古拉");
		two.add("張三豐");
		Stream<String> twoStream=two.stream().filter(name->name.startsWith("張")).skip(2);
		
		
		Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(System.out::println);
	}
}
