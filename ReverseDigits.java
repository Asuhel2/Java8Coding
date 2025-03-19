import java.util.stream.Stream;

public class ReverseDigits {

	public static void main(String[] args) {

		Integer number=54535;
		
		//Using Parse Integer
		Integer revNum=Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
		System.out.println(revNum);
		
		
		//Using Streams
		int reverDigits = Stream.of(new StringBuilder(String.valueOf(number)).reverse().toString())
				.mapToInt(Integer::parseInt).findFirst().orElse(0);
		System.out.println(reverDigits);
	}

}
