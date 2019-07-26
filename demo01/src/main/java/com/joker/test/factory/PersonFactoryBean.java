package com.joker.test.factory;

import com.joker.test.beans.Person;

public class PersonFactoryBean  {
	
	private Person person = new Person();
	
	public Person getObject() throws Exception {
		return person;
	}

	public Class<?> getObjectType() {
		return Person.class;
	}

	public boolean isSingleton() {
		return false;
	}
}
