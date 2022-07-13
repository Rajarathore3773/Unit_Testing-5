package com.zensar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test5 {

	Addition1 a = null;

	@BeforeEach
	public void setUp() {
		// System.out.println("hi");
		a = new Addition1();
	}

	@Test
	public void test_Add() {
		Addition1 a = new Addition1();
		int actualResult = a.add(3, 5);
		int expectedResult = 8;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testArray() {
		int actualArray[] = a.myArr();
		int expectedArray[] = { 1, 2, 3, 4, 5 };
		// assertEquals(expectedArray, actualArray);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testString() {

		String actualResult = a.getName("zensar");
		// try {
		// Thread.currentThread().sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		String expectedResult = "zENSAR";
		assertNotEquals(expectedResult, actualResult);
	}

	@Test
	public void testStringForNull() {
		String actulaResult = a.getName("abc");
		String expectedResult = null;
		// assertNull(expectedResult, actulaResult);
		assertNotNull(expectedResult, actulaResult);
	}

	@Test
	public void test_Sub() {
		// Addition a= new Addition();
		int actualResult = a.sub(4, 3);
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_Mul() {
		// Addition a= new Addition();
		int actualResult = a.mul(2, 3);
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void test_Div() {
		// Addition a= new Addition();
		int actualResult = a.div(2, 2);
		int expectedResult = 1;
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testException() {
		assertThrows(IllegalArgumentException.class,() -> a.getName(""));
	}
}
