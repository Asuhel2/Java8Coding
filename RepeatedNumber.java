import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedNumber {

	public static void main(String[] args) {

		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,2,3,5,9,10);
		//List<Integer> number=List.of(1,2,3,4,5,6,7,8,8,8,9,9,9);
		Map<Integer, Long> countMap = numbers.stream()
				.collect(Collectors.groupingByConcurrent(i -> i, Collectors.counting()));
		         countMap.entrySet().stream()
		        .filter(entry -> entry.getValue() > 1)
		        .map(Map.Entry::getKey)
				.forEach(System.out::println);
		
		Map<Integer,Integer> countMapp=new HashMap<Integer, Integer>();
		
		for(Integer num:numbers) {
			if(countMapp.containsKey(num)) {
				countMapp.put(num, countMapp.get(num)+1);
			}else {
				countMapp.put(num, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: countMapp.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
