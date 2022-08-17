package Basic.stream_2;

import java.util.ArrayList;
import java.util.List;
// Stream 寫法
public class ex2 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("張曉頻");
		list.add("周芷頻");
		list.add("張三豐");
		list.add("張強");
		list.add("貂蟬");
		list.stream()
		.filter(s->s.startsWith("張"))
		.filter(s->s.length()==3)
		.forEach(s->System.out.println(s));
	}
}
