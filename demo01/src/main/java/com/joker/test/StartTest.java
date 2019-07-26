package com.joker.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.joker.test.beans.Person;
import com.joker.test.factory.PersonFactoryBean;

public class StartTest {
	
	@Test
	public void testFactoryBean() throws BeansException, Exception {
		Resource resource = new ClassPathResource("test.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		PersonFactoryBean factoryBean = factory.getBean(PersonFactoryBean.class);
		Person p1 = factoryBean.getObject();
		Person p2 = factoryBean.getObject();
		//Assert.assertEquals(p1, p2);
		System.out.println(factory.getBean(PersonFactoryBean.class));
		System.out.println(factory.getBean(PersonFactoryBean.class));
		Assert.assertEquals(factory.getBean(PersonFactoryBean.class), factory.getBean(PersonFactoryBean.class));
		//System.out.println(factory.getBean("&personFactory"));//com.joker.test.beans.Person@4b85612c
	}
	
	@Test
	public void testResource() throws BeansException, Exception {
		Resource resource = new ClassPathResource("test.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
		System.out.println(factory.getBean(PersonFactoryBean.class).getObject());
	}
	
	
	
	
	
	
	
	
	
	
	
}
