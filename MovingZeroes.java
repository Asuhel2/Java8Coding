import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovingZeroes {

	public static void main(String[] args) {


		List<Integer> numbers=Arrays.asList(1,2,3,0,4,0,6,0,5);
		Stream<Integer> num1=numbers.stream().filter(n->n==0);
		Stream<Integer> num2=numbers.stream().filter(n->n!=0);
		List<Integer> moveZero=Stream.concat(num1, num2).collect(Collectors.toList());
		System.out.println(moveZero);
	}

}
