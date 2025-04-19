import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cases {

	public static void main(String[] args) {
		
		
		
		List<String> fruits=Arrays.asList("Apple","Banana","Cherry","Aprioct","Apple","Anar","GRAPE","GUVA","APPLE");
		List<String> uppercase=fruits.stream().map (String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
		System.out.println(
				fruits.stream().filter(s -> s.startsWith("B")).map(String::toUpperCase).collect(Collectors.toList()));
		List<String> lowercase=fruits.stream().filter(s->s.startsWith("G")).map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(lowercase); 
		
		System.out.println("Lower Cases:");
		List<String> toLower=fruits.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(toLower);
		
		System.out.println("Removing duplicates:");
		List<String> rmDuplicates=fruits.stream().distinct().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(rmDuplicates);
	}

}
