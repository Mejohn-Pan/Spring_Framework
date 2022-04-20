package org.springframework.beans.lookup;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 13932105637
 * @version l.0
 * @className Lookup_method_Test
 * @date 2021/5/18 11:15
 * @description TODO
 **/
public class Replaced_Method_Test {

	private DefaultListableBeanFactory defaultListableBeanFactory ;

	@Before
	public void setUp() {
		defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("replaceMethodTest.xml", TestChangeMethod.class));

	}
	@Test
	public void testLookUpMethodTest() {
		TestChangeMethod testChangeMethod = (TestChangeMethod) defaultListableBeanFactory.getBean("testChangeMethod");
		testChangeMethod.changeMe();
	}

}
