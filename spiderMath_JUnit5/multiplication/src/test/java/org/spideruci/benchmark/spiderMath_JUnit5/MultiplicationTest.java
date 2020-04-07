package org.spideruci.benchmark.spiderMath_JUnit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

	@Test
	public void testFail() {
		//assertEquals(1,2);
	}

	@Test
	public void testSuccess1() {
		assertEquals(4, Multiplication.multi(4, 1));	
	}
	
	@Test
	public void testSuccess2() {
		assertEquals(12, Multiplication.multi(4, 3));
	}

	@Disabled
	@Test
	public void testIgnore() {
		assertEquals(5, Multiplication.multi(4, 1));
	}
}
