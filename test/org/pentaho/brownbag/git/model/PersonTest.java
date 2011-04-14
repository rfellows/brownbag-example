package org.pentaho.brownbag.git.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testName() {
		final String name = "Testing";
		final Person p = new Person();
		p.setName(name);
		assertEquals(name, p.getName());
		fail();
	}


	@Test
	public void testAge() {
		final int age = 32;
		final Person p = new Person();
		p.setAge(age);
		assertEquals(age, p.getAge());
		fail();
	}

	@Test
	public void testWeight() {
		final int weight = 180;
		final Person p = new Person();
		p.setWeight(weight);
		assertEquals(weight, p.getWeight());
		fail();
	}
}
