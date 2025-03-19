import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {

		int number=523;
		System.out.println(String.valueOf(number).chars().map(c->c-'0').sum());
		
		List<Integer> numbers=Arrays.asList(10,23,44,57,92);
		List<Integer> evenNum=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		List<Integer> oddNum=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(oddNum );
		
		//List of numbers sum
		System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
		int summ=numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(summ);
		//IntStream.rangeClosed(0, 100).forEach(System.out::println);
	}

}
