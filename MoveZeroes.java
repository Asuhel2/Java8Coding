import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroes {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, -2, -3, 0, 5, -5, -6, 0, -7, -9, 0);
		Stream<Integer> list1 = numbers.stream().filter(n -> n == 0);
		Stream<Integer> list2 = numbers.stream().filter(n -> n != 0);
		System.out.println(Stream.concat(list1, list2).collect(Collectors.toList()));
		
		System.out.println(Stream.concat(numbers.stream().filter(n -> n == 0), numbers.stream().filter(n -> n != 0))
				.collect(Collectors.toList()));
	}

}
