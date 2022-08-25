package Basic.stream_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//  如果需要将流中的元素映射到另一个流中，可以使用 map 方法。

public class end {
	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("3", "2", "2", "3", "7", "3", "5");
		
		IntStream stream =numbers.stream().mapToInt(i->Integer.parseInt(i));
		
		// IntStream API
		System.out.println(stream.average()); // OptionalDouble[3.5714285714285716]
		System.out.println(numbers.stream().mapToInt(i->Integer.parseInt(i)).max()); // OptionalInt[7]
		System.out.println(numbers.stream().mapToInt(i->Integer.parseInt(i)).min()); // OptionalInt[2]
		System.out.println(numbers.stream().mapToInt(i->Integer.parseInt(i)).sum()); // 25
		System.out.println(numbers.stream().mapToInt(i->Integer.parseInt(i)).summaryStatistics());
		// IntSummaryStatistics{count=7, sum=25, min=2, average=3.571429, max=7}
		
		
		List<String> list1 =Arrays.asList("hello world","i am fine","thank you");
		//  map(Function<? super T,? extends R> mapper)   Returns a stream consisting of the results of applying the given function to the elements of this stream.
		list1.stream().map(i->i.split(" ")).forEach(i->System.out.println(Arrays.toString(i)));// [hello, world] [i, am, fine] [thank, you]
		
		// 	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)  Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
		list1.stream().flatMap(i->Stream.of(i.split(" "))).forEach(i->System.out.print(i+" ")); // hello world i am fine thank you 
		System.out.println();
		
		// sorted()-1 升序
		numbers.stream().mapToInt(i->Integer.parseInt(i)).sorted().forEach(System.out::print); // 2233357
		System.out.println();
		// distinct() 不含相同元素
		numbers.stream().mapToInt(i->Integer.parseInt(i)).distinct().sorted().forEach(System.out::print); // 2357
		System.out.println();
		
		// sorted()-2 降序  	sorted(Comparator<? super T> comparator)
		numbers.stream().map(i->Integer.parseInt(i)).sorted((i,j)->j-i).forEach(i->System.out.print(i+" ")); // 5 3 3 3 2 2 
		System.out.println();
		numbers.stream().map(i->Integer.parseInt(i)).sorted(Collections.reverseOrder()).forEach(i->System.out.print(i+" ")); // 7 5 3 3 3 2 2 
	
		// reduce 歸納 Optional<T> reduce(BinaryOperator<T> accumulator)
		System.out.println(numbers.stream().map(i->Integer.parseInt(i)).reduce((i,j)->i+j).get());// 25
		Optional<Integer> op =numbers.stream().map(i->Integer.parseInt(i)).reduce((i,j)->i+j);
		
		// filter  	filter(Predicate<? super T> predicate)
		numbers.stream().mapToInt(i->Integer.parseInt(i)).filter(i->i>=3).distinct().sorted().forEach(i->System.out.print(i+" ")); // 3 5 7 
		System.out.println();
		
		// count  Returns the count of elements in this stream.
		long x=numbers.stream().mapToInt(i->Integer.parseInt(i)).filter(i->i>=3).count(); 
		System.out.println(x); // 5
		
		// Optional<T> findFirst()  Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.
		// Optional<T> findAny() Returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
		List<String> user=Arrays.asList("Java programmer","Java web developer","python analytics");
		System.out.println(user.stream().filter(i->i.contains("Java")).findFirst().get()); // Java programmer
		System.out.println(user.stream().filter(i->i.contains("Java")).parallel().findAny().get()); // Java web developer <-- 並行，findAny()為隨機取值，非並行則預設為第一個。
		
		
		// skip & limit
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(num.stream().skip(3).findFirst()); // Optional[4]
		System.out.println(num.stream().skip(3).allMatch(i->i>=3)); // true
		
		num.stream().limit(5).forEach(i->System.out.print(i+" ")); // 1 2 3 4 5 
		
		// peek() 須有終結方法搭配才會執行
		Consumer<Integer> c =new Consumer<Integer>() {
			int sum=0;
			@Override
			public void accept(Integer t) {
				sum+=t;
				System.out.println("sum: "+sum);
			}
		};
		num.stream().map(i->i*2).peek(i->c.accept(i)).collect(Collectors.toList());
		
		
		// peek()-2 相連
		num.stream().peek(i->System.out.println(i)).peek(i->System.out.println(" "+i*2)).collect(Collectors.toList()); // 會交互執行。
		
		// peek()-3 sorted()
		num.stream().peek(i->System.out.println(i)).sorted((i,j)->j-i).peek(i->System.out.println(" "+i)).collect(Collectors.toList()); // 前者做完，後者才做。
		
		// 例外： map()
		num.stream().peek(i->System.out.println(i)).map(i->i*2).peek(i->System.out.println(" "+i)).collect(Collectors.toList()); // 會交互執行。
	
		
		// concat 合併
		Stream<Integer> s1=Stream.of(1,2,3,4,5);
		Stream<Integer> s2=Stream.of(6,7,8,9,10);
		Stream<Integer> s3=Stream.concat(s1, s2);
		s3.forEach(System.out::print); // 12345678910
		System.out.println();
		
		
		
		// collect
		// groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
		List<String> g = Arrays.asList("geeks", "for", "geeks"); 
		Map<String, Long> result  = g.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
		System.out.println(result); // {geeks=2, for=1}
		
		// joining(CharSequence delimiter)
		List<String> str=Arrays.asList("I AM","A GOOD","PERSON");
		String s =str.stream().flatMap(i->Stream.of(i.split(" "))).collect(Collectors.joining(","));
		System.out.println(s); // I,AM,A,GOOD,PERSON
		
		// filtering​(Predicate<? super T> predicate, Collector<? super T,A,R> downstream)
		/*
		 * 先使用groupingBy第一参数计算结果对元素进行分组，第一参数结果数据作为Map中的key，
		 * 然后对分组结果进行filtering操作，filtering第一个参数是过滤条件，第二参数把过滤后结果数据保存的在~~中
		 * 
		 */
		List<Employee> roster=new ArrayList<>();
		Predicate<Employee>p=e->e.getSalary()>9000;
		Function<Employee, Optional<String>> f=e->Optional.ofNullable(e.getNeighborhood());
		roster.add(new Employee("Cherry","Me",10000));
		roster.add(new Employee("Kelly","Me",12000));
		roster.add(new Employee("Jamie","Me",14000));
		roster.add(new Employee("NightCat","Me",16000));
		roster.add(new Employee("Wendy","Me",18000));
		Map<Optional<String>, List<Employee>> r=roster.stream()
					.collect(Collectors.groupingBy(f,Collectors.filtering(p, Collectors.toList())));
		Set<Optional<String>> set=r.keySet();
		Iterator<Optional<String>> it =set.iterator();
		while(it.hasNext()) {
			Optional<String> o=it.next();
			System.out.println("key: "+o.get());
			System.out.println("value: "+r.get(o));
		}
	}
	
}
class Employee{
	private String name;
	private String neighborhood;
	private int salary;
	public Employee() {
	
	}
	public Employee(String name, String neighborhood, int salary) {
		super();
		this.name = name;
		this.neighborhood = neighborhood;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", neighborhood=" + neighborhood + ", salary=" + salary + "]";
	}
	
	
}
