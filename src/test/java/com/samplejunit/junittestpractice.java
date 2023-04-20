package com.samplejunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;

import org.junit.Test;

public class junittestpractice {

	junitpractice j1=new junitpractice();
	

	@Test
	@DisplayName("bhaskara testing")
	public void testbiggest() {
		
		int exp=6;
		int res=j1.biggest(2, 6);
		assertEquals(exp,res);
		
	}
	
	@Test
	public void testbiggest2() {
		
	assertNotEquals(3,j1.biggest(3, 4));	
				
	}
	
	@Test
	public void checkname() {
		
		
		assertSame("Bhaskara",j1.whatisyourname());
		
		
	}
	
	@Test
	public void checkname2() {
		
		assertNotSame("java",j1.whatisyourname());
		
	}
	
	@Test
	public void eventest() {
		boolean res=j1.even(6);
		assertTrue(res);
	}
	
	@Test
	public void testodd() {
		boolean res=j1.even(7);
		assertFalse(res);
	}
	
	
	
}
