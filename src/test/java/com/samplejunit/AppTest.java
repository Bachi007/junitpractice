package com.samplejunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest{
	
@Test
public void testadd() {
	App a1=new App();
	int exp=5;
	int res=a1.add(3, 3);
	assertEquals(exp,res);
}
	
	
}