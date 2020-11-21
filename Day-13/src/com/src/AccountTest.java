package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testDeposit() {
		Account a=new Account("hello",456789123,5000);
		Boolean b=a.deposit(7000);
		assertEquals(b,true);
	}

}
