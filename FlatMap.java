import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

		List<List<String>> strings = Arrays.asList(Arrays.asList("Java", "Spring", "Spring Boot"),
				Arrays.asList("React", "Angukar", "JavaScript"), Arrays.asList("Microservices", "RESTAPI", "Kafka"));
		System.out.println(strings.stream().flatMap(skills -> skills.stream()).collect(Collectors.toList()));
	}

}
