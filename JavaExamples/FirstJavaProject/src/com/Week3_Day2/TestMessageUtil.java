package com.Week3_Day2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMessageUtil {
	MessageUtil msg= null;
	int num=5;
	String temp=null;

	@Before
	public void setUp() throws Exception {
		msg=new MessageUtil("HelloWorld");
	}

	@Test
	public void testprintMessage() {
		assertEquals("HelloWorld",msg.printMessage());      
		
	}
	@Test
	public void testaddNumber() {
		assertEquals(7,msg.addNumber(2, 5));
		assertFalse(num>7);
		assertNull(temp);		
	}
	@Test(expected=ArithmeticException.class)
	public void testgetMessage() {
		msg.getMessage();
		
	}

}
