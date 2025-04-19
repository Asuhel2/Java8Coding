import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MostAskedJavaQuestions {

	public static void main(String[] args) {

		//Factorial of 5 using streams
		System.out.println(LongStream.rangeClosed(1, 5).reduce(1,(a,b)->a*b));
		System.out.println(IntStream.rangeClosed(1,4).reduce(1,(a,b)->a*b));
		
		//Swap two numbers without third variable;
		int a=5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+",b="+b);
		
		//Fibbonacci series
		
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[1])
				.forEach(System.out::println);
		
		//Palindrom
		
		String input="madam";
		boolean isPalindrome=input.equals(new StringBuilder(input).reverse().toString());
		System.out.println(isPalindrome);
	}

}
