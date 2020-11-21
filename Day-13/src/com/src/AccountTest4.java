package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest4 {

	@Test
	void testgetaccountnumber() {
		Account a=new Account("hello",456789123,5000);
		long b=a.getAccountNumber();
		assertEquals(b,456789123);
	}

}
