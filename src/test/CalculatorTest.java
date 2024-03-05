package test;

import static telran.numbers.Calculator.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private static final double DELTA = 0.00001;

	@Test
	void testSum() {
		assertEquals(0, sum(2, -2));
		assertEquals(-2.5, sum(2, -4.5));
		assertEquals(4.0, sum(2, 2));
		assertEquals(2, sum(2, 0));
		assertEquals(3, sum(0, 3));
		assertEquals(-7.3, sum(-10.3, 3), DELTA);
		assertEquals(-30.9, sum(-10.3, -20.6), DELTA);
	}

	@Test
	void testSub() {
		assertEquals(2, sub(4, 2));
		assertEquals(-2, sub(2, 4));
		assertEquals(2, sub(2, 0));
		assertEquals(-2, sub(0, 2));
		assertEquals(2, sub(0, -2));
		assertEquals(2, sub(-2, -4));
	}

	@Test
	void testMul() {
		assertEquals(4, mul(2, 2));
		assertEquals(-4, mul(2, -2));
		assertEquals(5, mul(-2.5, -2));
		assertEquals(0, mul(-2.5, 0), DELTA);
		assertEquals(0, mul(0, -2.5), DELTA);
	}

	@Test
	void testDiv() {
		assertEquals(2.5, div(5, 2));
		assertEquals(Double.POSITIVE_INFINITY, div(4, 0));
		assertEquals(Double.NEGATIVE_INFINITY, div(-4, 0));
		assertEquals(Double.NaN, div(0, 0));
		assertEquals(-2.5, div(-5, 2));
		assertEquals(2.5, div(-5, -2));
	}

}
