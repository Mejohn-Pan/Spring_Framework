package org.springframework.beans.lookup;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.beans.factory.xml.DefaultLifecycleMethodsTests;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import java.lang.reflect.Method;

/**
 * @author 13932105637
 * @version l.0
 * @className TestChangeMethod
 * @date 2021/5/18 14:51re
 * @description TODO
 **/
public class TestChangeMethod {
	public void changeMe(){
		System.out.println("changeMe");
	}
}

class TestMethodReplacer implements MethodReplacer{
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我替换了原有的方法");
		return null;
	}
}