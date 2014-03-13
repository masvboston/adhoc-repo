package com.masv.mark;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.masv.mark.Person;

public class TestAspectJ {

	@Test
	public void testPerson() {

		final Person p = new Person("Mark");
		final String name = p.getName();

		assertEquals("mark", name);

	}

}
