package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest3 {

	@Test
	void testaddinterest() {
		Account a=new Account("hello",456789123,2000);
		a.addInterest();
		float f=a.getBalance();
		float bal=2000+(2000*0.045f);
		assertEquals(f,bal);
	}

}
