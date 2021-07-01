package Interface;
import java.util.ArrayList;

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
		
		System.out.println(mergeList.get(1));
		
	}

}
