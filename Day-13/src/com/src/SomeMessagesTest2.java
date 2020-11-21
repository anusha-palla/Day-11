package com.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeMessagesTest2 {
	String message="Anusha";
	SomeMessages sm=new SomeMessages(message);


	@Test
	public void testappendmessage()
	{
		System.out.println("this is append message");
		message="hello "+message;
		assertEquals(message,sm.appendMessage());
	}

}
