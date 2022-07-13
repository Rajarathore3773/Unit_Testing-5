package com.zensar;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class StringUtilityTest {

	@Test
	public void convertIntForPositive() {
		Integer toInt= StringUtility.convertToInt("10");
		//Integer excpected = 10;
	//	assertEquals(excpected,toInt);
		assertEquals(new Integer(10),toInt);
	}
	
	@Test
	public void convertToIntNullParameter() {
		
		String str=null;
		assertThrows(IllegalArgumentException.class, ()->{
			StringUtility.convertToInt(str);
		});
		
	}
}
