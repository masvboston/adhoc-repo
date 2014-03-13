package org.gradle;

import org.apache.commons.collections4.list.GrowthList;

public class Person {
	private final String name;

	public Person(final String name) {
		this.name = name;
		new GrowthList();
	}

	public String getName() {
		return name;
	}
}
