package com.samplejunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class pravallika {

	@Test
	public void testadd() {
		App a1=new App();
		int exp=5;
		int res=a1.add(2, 3);
		assertEquals(exp,res);
	}
	
	
	@Test
	public void testsub() {
		App a1=new App();
		int exp=5;
		int res=a1.add(2, 3);
		assertEquals(exp,res);
	}
}
