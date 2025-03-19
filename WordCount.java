import java.util.HashMap;
import java.util.stream.Stream;

public class WordCount {
	
	public static void main(String args[]) {
		
		String str="Mahammad Suhel Allugundu Suhel ";
		
		//Using Java8 Streams
		str=str.trim();
		System.out.println(Stream.of(str.split("\\s+")).count());
		
		//Using Hashmap
		 
		HashMap<String, Integer> countMap=new HashMap<String, Integer>();
		String[] words=str.split(" ");
		
		for(String word:words) {
			if(countMap.containsKey(word)) {
				countMap.put(word, countMap.get(word)+1);
			}else {
				countMap.put(word, 1);
			}
		}
		System.out.println("word count is:" +countMap);
 	}

}
