package com.invitae.bmcdonell;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAppTest {

	@Test
	public void testGetMessage() {
		assertEquals("Hello, github actions.", (new TestApp()).getMessage());
	}

	//@Test
	public void testWillFail() {
		assertEquals("blah...", (new TestApp()).getMessage());
	}

}
