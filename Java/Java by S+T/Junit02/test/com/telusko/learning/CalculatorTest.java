package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c1= new Calculator();
	
	@Test
	public void testAdd() {
		int res= c1.add(12, 0);
		int expectedResult=12;
		assertEquals(expectedResult, res);
	}

	@Test
	public void testSub() {
		int res= c1.sub(12, 0);
		int expectedResult=12;
		assertEquals(expectedResult, res);
	}

	@Test
	public void testMul() {
		int res= c1.mul(12, 0);
		int expectedResult=0;
		assertEquals(expectedResult, res);
	}

	@Test
	public void testDiv() {
		int res= c1.div(12, 2);
		int expectedResult=6;
		assertEquals(expectedResult, res);
	}

}
