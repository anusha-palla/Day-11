package com.src;

public class SomeMessages {
	private String message;
	
	public SomeMessages(String message) {
		super();
		this.message = message;
	}
	public String  printMessage()
	{
		return message;
	}
	public String appendMessage()
	{
		message="hello "+message;
		return message;
	}

}
