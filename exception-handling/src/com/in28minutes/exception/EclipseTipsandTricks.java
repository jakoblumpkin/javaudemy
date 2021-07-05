package com.in28minutes.exception;

import java.math.BigDecimal;

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class EclipseTipsandTricks {

	private static final int INT = 1000 * 45 * 456;

	public static void main(String[] args) throws InterruptedException {
		
		DummyForTest dt = new DummyForTest();
		dt.doSomething();

		BigDecimal bd = new BigDecimal(25);
		int millis = INT;
		Thread.sleep(millis);
	}

}
