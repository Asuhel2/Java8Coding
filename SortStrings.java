import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortStrings {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("boost","apple","cup");
		
		names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		List<Integer> numbers=Arrays.asList(30,20,150);
		Integer maximum=numbers.stream().max(Integer::compare).get();	
		Integer minimum=numbers.stream().min(Integer::compare).get();
		System.out.println(minimum);
		System.out.println(maximum);
		System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
		
		System.out.println("Functional Interface");
		List<String> strings=Arrays.asList("Zero","Seven","And","One");
		strings.forEach(string->System.out.println(string));
	
		System.out.println("Reverse the List Of Elements");
		strings.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		Integer max=numbers.stream().max(Integer::compare).get();
		System.out.println(max);
		
		System.out.println("sum of list of values");
		System.out.println(numbers.stream().mapToInt(Integer::valueOf).sum());
		

		String str="Mahammad SUhel";
		String output=str.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(output);  
		
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
		.limit(10)
		.map(t -> t[1])
		.forEach(System.out::println);
		
		System.out.println("Reverse digits and starts with one");
		
		int num=5432713;
		System.out.println(Stream.of(new StringBuilder(String.valueOf(num)).reverse().toString()).mapToInt(Integer::parseInt).findFirst()
				.orElse(0));
		
		System.out.println(numbers.stream().sorted(Comparator.naturalOrder()).findFirst());
	}

}
