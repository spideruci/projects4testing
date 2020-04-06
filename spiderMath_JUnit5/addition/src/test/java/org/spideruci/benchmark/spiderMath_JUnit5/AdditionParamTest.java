package org.spideruci.benchmark.spiderMath_JUnit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class AdditionParamTest {

	int expt, a, b;
	
	@ParameterizedTest(name = "{index} => expt={0}, a={1}, b={2}")
	@CsvSource({
		"3, 1, 2",
		"5, 2, 3"
    })
	public void testAdd(int expt, int a, int b) {
		assertEquals(expt, Addition.add(a, b));
	}
}
