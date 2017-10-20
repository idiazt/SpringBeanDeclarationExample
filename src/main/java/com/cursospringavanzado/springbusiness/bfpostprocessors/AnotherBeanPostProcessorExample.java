package com.cursospringavanzado.springbusiness.bfpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AnotherBeanPostProcessorExample implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String texto) throws BeansException {
		System.out.println("Another Después Inic. Bean: " + object.getClass());
		if (object.getClass().getName().contains("MailConfigBean")) {
			System.out.println("Another Propiedad host: " + ((MailConfigBean)object).getHost());
		}
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String texto) throws BeansException {
		System.out.println("Another Antes Inic. Bean: : " + object.getClass());
		if (object.getClass().getName().contains("MailConfigBean")) {
			System.out.println("Another Propiedad host: " + ((MailConfigBean)object).getHost());
		}
		return object;
	}

}
