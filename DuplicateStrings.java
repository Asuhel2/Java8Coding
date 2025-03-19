import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateStrings {

	public static void main(String[] args) {

		List<String> strings=Arrays.asList("Hello","Hi","Hero","Hroine","Hui","Hui","Hi");
		
		HashMap<String, Integer> countMp=new HashMap<String, Integer>();
		
		for(String word:strings) {
			if(countMp.containsKey(word)) {
				countMp.put(word, countMp.get(word)+1);
			} else {
				countMp.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry: countMp.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
	}

}
