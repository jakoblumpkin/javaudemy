package com.in28minutes.functionalprogramming;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		//printWithFPWithFiltering(list);
		
		//excersises
		//1
		//IntStream.range(1, 11).forEach( e -> System.out.println(e * e) );
		
		//2
		List<String> creature = List.of("Apple", "Ant", "Bat");
		Stream<Object> abc = creature.stream().map(e -> e.toLowerCase());
		abc.forEach(e -> System.out.println(e));
		
		//3 
		List<String> forLength = List.of("Apple", "Ant", "Bat");
		forLength.forEach( e -> System.out.println(e.length() ));

	}

	private static void printBasic(List<String> list) {
		for(String string: list) {
			System.out.println(string);
		}
	private static void printWithFP(List<String> list) {
         list.stream().forEach(
        		 element -> System.out.println("element - " + element));
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
             .filter(
            		 element -> element.endsWith("at"))
                .forEach(
       		          element -> System.out.println("element - " + element)
       		          );
	}
        		 
	private static void printBasicWithFiltering(List<String> list) {
			for(String string: list) {
				if( string.endsWith("at")) {
					System.out.println(string);
				}
				}
			}


}
