package udemy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		//unique - SET
		// Tree
		// Hash
		// LinkedHash
		
		//Types of sets
		
		//Sort in order
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet " + treeSet);
		
		
		//sort by ordered entered into array
		Set<Character> LinkedHashSet = new LinkedHashSet<>(characters);
		System.out.println(LinkedHashSet);
		
		//order randomly
		Set<Character> HashSet = new HashSet<>(characters);
		System.out.println(HashSet);

	}

}
