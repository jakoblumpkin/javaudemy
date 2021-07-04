package com.in28minutes.functionalprogramming;

import java.util.List;
import javax.sql.rowset.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {
	
	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

public class LambdaBehindtheScreensRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48).stream()
		.filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));

	}

}
