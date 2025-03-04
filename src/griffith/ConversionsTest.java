package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void euroToDollarTest() {
		//Create Conversions class instance
		Conversions conversions = new Conversions();
		
		//Test euro is 10
		assertEquals(10.48, conversions.euroToDollar(10));
		//Test euro is 5
		assertEquals(5.24, conversions.euroToDollar(5));
		//Test euro is 0
		assertEquals(0, conversions.euroToDollar(0));
		//Test euro is -999
		assertEquals(0, conversions.euroToDollar(-999));
	}
	
	@Test
	void dollarToEuroTest() {
		//Create Conversions class instance
		Conversions conversions = new Conversions();
		
		//Test dollar is 9.432
		assertEquals(9, conversions.dollarToEuro(9.432));
		//Test dollar is 102.704
		assertEquals(98, conversions.dollarToEuro(102.704));
		//Test dollar is 0
		assertEquals(0, conversions.dollarToEuro(0));
		//Test dollar is -999
		assertEquals(0, conversions.dollarToEuro(-999));
	}
	
	@Test
	void stringToIntegerTest() {
		//Create Conversions class instance
		Conversions conversions = new Conversions();
		
		//Test string is 9
		assertEquals(9, conversions.stringToInteger("9"));
		//Test string is 14
		assertEquals(14, conversions.stringToInteger("14.55"));
		//Test string is 0
		assertEquals(0, conversions.stringToInteger("0"));
		//Test string is -999
		assertEquals(-999, conversions.stringToInteger("-999"));
		//Test string is null
		assertEquals(0, conversions.stringToInteger(null));
	}
	
	@Test
	void integerToStringTest() {
		//Create Conversions class instance
		Conversions conversions = new Conversions();
		
		//Test int is 10
		assertEquals("10", conversions.integerToString(10));
		//Test int is 99
		assertEquals("99", conversions.integerToString(99));
		//Test int is 0
		assertEquals("0", conversions.integerToString(0));
		//Test int is -1000
		assertEquals("-1000", conversions.integerToString(-1000));
	}
	
	@Test
	void switchCaseTest() {
		fail("Not yet implemented");
	}

}
