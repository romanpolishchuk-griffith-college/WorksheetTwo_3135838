package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversionsTest {

	@Test
	void euroToDollarTest() {
		//Create grades class instance
		Conversions conversions = new Conversions();
		
		//Test max is the first element
		assertEquals(10.48, conversions.euroToDollar(10));
		//Test max is the last element
		assertEquals(5.24, conversions.euroToDollar(5));
		//Test max is in the middle
		assertEquals(0, conversions.euroToDollar(0));
		//Test max is the negative number
		assertEquals(0, conversions.euroToDollar(-999));
	}
	
	@Test
	void dollarToEuroTest() {
		fail("Not yet implemented");
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
