package com.code.EPAM_TASK_6;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;

public class CCListTest
{
	public void test() 
	{
		CCList c=new CCList();
		int answer=c.Adding("10");
		c.Adding("20");
		assertEquals(1, answer,0.1);
		assertTrue( true );
	}
}
