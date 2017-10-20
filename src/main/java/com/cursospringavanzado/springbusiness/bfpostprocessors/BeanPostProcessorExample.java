package com.cursospringavanzado.springbusiness.bfpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorExample implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String texto) throws BeansException {
		System.out.println("Después Inic. Bean: " + object.getClass());
		if (object.getClass().getName().contains("MailConfigBean")) {
			System.out.println("Propiedad host: " + ((MailConfigBean)object).getHost());
		}
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String texto) throws BeansException {
		System.out.println("Antes Inic. Bean: : " + object.getClass());
		if (object.getClass().getName().contains("MailConfigBean")) {
			System.out.println("Propiedad host: " + ((MailConfigBean)object).getHost());
		}
		return object;
	}

}
