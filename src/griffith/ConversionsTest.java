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
		fail("Not yet implemented");
	}
	
	@Test
	void integerToStringTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void switchCaseTest() {
		fail("Not yet implemented");
	}

}
