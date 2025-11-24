package Calender;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectDateTest {
	//this test is made to succeed
	@Test
	void dateTest() {
		SelectDate selector = new SelectDate();
		
		assertEquals(selector.dateChecker(11, 17, 2025), true);
	}
	
	//this test is made to fail
	@Test
	void dateTest2() {
		SelectDate selector = new SelectDate();
		
		assertEquals(selector.dateChecker(17, 0, 100), true);
	}
}