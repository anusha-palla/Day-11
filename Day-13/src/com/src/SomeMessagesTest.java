package com.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeMessagesTest {
	String message="Anusha";
	SomeMessages sm=new SomeMessages(message);

	@Test
	public void testprintmessage() {
		System.out.println("this is print message");
		assertEquals(message,sm.printMessage());
	}

}
