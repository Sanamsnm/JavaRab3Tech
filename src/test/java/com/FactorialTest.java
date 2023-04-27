package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
	

	public void whenNoIs4() {

		Factorial factorial = new Factorial();
		int result = factorial.fact(4);
		assertEquals(24, result);

	}

	@Test

	public void whenNoIs5() {

		Factorial factorial = new Factorial();
		int result = factorial.fact(5);
		assertEquals(120, result);
	}

	@Test

	public void whenNoIs1() {

		Factorial factorial = new Factorial();
		int result = factorial.fact(1);
		assertEquals(1, result);
	}

	@Test

	public void whenNoIs0() {

		Factorial factorial = new Factorial();
		int result = factorial.fact(0);
		assertEquals(1, result);
	}

	@Test(expected = ArithmeticException.class)

	public void whenNoIsNegative() {

		Factorial factorial = new Factorial();
		factorial.fact(-5);

	}
}
