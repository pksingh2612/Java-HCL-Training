package com.Week3_Day2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//POJO
public class TestExample {
	@Test
	public void test1() {
		System.out.println("test1 testing");
	}
	@Test
	public void test2() {
		System.out.println("test2 testing");
	}
	@Test
	public void test3() {
		System.out.println("test3 testing");
	}
	@BeforeClass
	public static void method1() {
		System.out.println("only once before all test methods executed");
	}
	@AfterClass
	public static void method2() {
		System.out.println("only once after all test methods executed");
	}
	@Before
	public void method3() {
		System.out.println("before each test executed");		
	}
	@After
	public void method4() {
		System.out.println("After each test executed");		
	}
	

}