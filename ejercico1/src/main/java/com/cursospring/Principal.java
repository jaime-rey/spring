package com.cursospring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.beans.BeanSaludo;

public class Principal {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BeanFactory factory = context;

		BeanSaludo saludoBean = (BeanSaludo) factory.getBean("saludoBean");
		System.out.println(saludoBean.getSaludo());

	}

}
