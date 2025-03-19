import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortStrings {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("Moon","Sun","Jupiter");
		
		names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		List<Integer> numbers=Arrays.asList(30,20,150);
		Integer maximum=numbers.stream().max(Integer::compare).get();	
		Integer minimum=numbers.stream().min(Integer::compare).get();
		System.out.println(minimum);
		System.out.println(maximum);
		System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
		System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
	}

}
