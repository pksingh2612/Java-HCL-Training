package com.Week3_Day2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class TestMessageUtil1 {
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
	@Ignore
	public void testgetMessage() {
		msg.getMessage();
		
	}


}