package udemy;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.List;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value2.length(), value1.length());
	}
}

public class QueueRunner {
   
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(
				new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		
		/*String excercise = "This is a great thing";
		String newexcercise = excercise.replaceAll("\\s", "");
		
		for(int i = 0; i < newexcercise.length(); i++) {
			System.out.println(newexcercise.charAt(i));
		}*/
		
		

	}

}
