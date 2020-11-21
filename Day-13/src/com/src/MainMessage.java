package com.src;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class MainMessage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Result result=JUnitCore.runClasses(AllTests.class);
	for(Failure failure:result.getFailures())
	{
		System.out.println(failure);
	}
	System.out.println(result.wasSuccessful());

	}

}
