package Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("jakob");
		list1.add("tom");
		list1.add("jerry");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("jaylon");
		list2.add("perry");
		list2.add("ohio");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("alex");
		list3.add("rockit");
		list3.add("houston");
		
		ArrayList<String> mergeList = new ArrayList<String>();
		
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		mergeList.addAll(list3);
		
		//System.out.println(mergeList.get(1));
		//System.out.println(mergeList.size());
		
		//for(int i = 0; i <= mergeList.size(); i++) {
		//	System.out.println(mergeList.get(i));
		//}
		
		List<String> words = List.of("Apple", "Bat", "Cat");
		List<String> wordsAl = new ArrayList<>(words);
		System.out.println(words);
		System.out.println(wordsAl);
		
		/*for(String word: words) {
			if(word.endsWith("at")) {
				System.out.println(word);
			}
		}
		
		for(String word: wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
			}
		}*/
		
		//Remove from list using iternator
		
		Iterator<String> iterator = wordsAl.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}
		
		System.out.println(wordsAl);
		
		List value = List.of("A", 'A', 1, 1.0);
		
		List<Integer> numbers = List.of(101, 102, 103, 104, 105);
		
		//stem.out.println(numbers.indexOf(101));
		
		List<Integer> numberAl = new ArrayList<>(numbers);
		
		numberAl.indexOf(101);
		
		numberAl.remove(Integer.valueOf(101));
		
		//System.out.println(numberAl);
		
		List<Integer> numbers1 = List.of(123, 12, 3, 45);
		
		List<Integer> numberAll = new ArrayList<>(numbers1);
		
		Collections.sort(numberAll);
		System.out.println(numberAll);
	}

}
