package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAspectJ {
	@Test
	public void nameIsLower() {
		final Person p = new Person("Mark");
		assertEquals("mark", p.getName());
	}
}
