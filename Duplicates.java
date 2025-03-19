import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(32, 12, 32, 44, 56, 67, 85, 44);

		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (Integer num : numbers) {
			if(countMap.containsKey(num)) {
				countMap.put(num,countMap.get(num)+1);
			}else {
				countMap.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
