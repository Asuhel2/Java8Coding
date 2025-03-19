import java.awt.peer.ListPeer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CollectionIterator {
	public static void main(String args[]) {
		
		//Using for each loop
		List<Integer> list=Arrays.asList(1,23,4,5,68,9,10);
		for(Integer i:list) {
			System.out.println(i);
		}
		
		
		//Using Iterator
		List<String> list1=Arrays.asList("Hi","Hello","Good");
		Iterator<String> iterator=list1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Using ListIterator
		ListIterator<String> listIterator=list1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println( listIterator.next());
			
		}
		
		//Using Java8 Streams
		
		list.stream().forEach(System.out::println);
		
		//Using java8 method reference
		
		list.forEach(System.out::println);
		
		//using lambda expressions
		
		list.forEach(num->System.out.println(num));
		
	}

}
