package com.zensar;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheakTest {

	@ParameterizedTest
	@ValueSource(strings = { "MADAM", "121" })
	public void TestPalindrome() {
		PalindromeCheck pc = new PalindromeCheck();
		
		boolean actualResult = pc.isPalindrome("MADAM");
		boolean expected = true;

		assertEquals(expected, actualResult);

	}
}