package com.cursospringavanzado.springbusiness.bfpostprocessors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanFactoryPostProcessorTest {
	
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MailConfigFactoryPostProcessor.class);
		MailConfigBean mailBean = context.getBean("mailConfigBean", MailConfigBean.class);
		System.out.println("Propiedad host: " + mailBean.getHost());
	}
}
