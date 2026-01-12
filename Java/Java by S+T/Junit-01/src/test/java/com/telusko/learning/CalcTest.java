package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c1= new Calc();
		int res= c1.divide(12, 2);
		int expectedResult= 6;
		assertEquals(expectedResult, res);
	}

}
