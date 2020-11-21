package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest2 {

	@Test
	void testwithdraw() {
		Account a=new Account("hello",456789123,5000);
		boolean b=a.withdraw(2000, 100);
		assertEquals(b,true);
	}

}
