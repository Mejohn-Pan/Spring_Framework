package org.springframework.beans.lookup;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.LookupMethodTests;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.tests.sample.beans.TestBean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author 13932105637
 * @version l.0
 * @className Lookup_method_Test
 * @date 2021/5/18 11:15
 * @description TODO
 **/
public class Lookup_method_Test {

	private DefaultListableBeanFactory defaultListableBeanFactory;

	@Before
	public void setUp() {
		defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("lookupTest.xml", getClass()));
	}
	@Test
	public void testLookUpMethodTest() {
		GetBeanTest getBeanTest = (GetBeanTest) defaultListableBeanFactory.getBean("getBeanTest");
		getBeanTest.showMe();
	}

}
