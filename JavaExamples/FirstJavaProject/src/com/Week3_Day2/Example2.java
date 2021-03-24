package com.Week3_Day2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Example2 {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestMessageUtil.class);
		
		for(Failure f:result.getFailures()) {
			System.out.println(f.toString());
		}
		System.out.println(result.wasSuccessful());

	}

}