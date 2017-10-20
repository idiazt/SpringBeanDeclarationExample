package com.cursospringavanzado.springbusiness.bfpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MailConfigFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory (
              ConfigurableListableBeanFactory beanFactory)
              throws BeansException {

    	beanFactory.addBeanPostProcessor(new BeanPostProcessorExample());
    	beanFactory.addBeanPostProcessor(new AnotherBeanPostProcessorExample());
    	
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(MailConfigBean.class);
        bd.getPropertyValues().add("host", "smtp.gmail.com");

        ((DefaultListableBeanFactory) beanFactory)
                  .registerBeanDefinition("mailConfigBean", bd);
    }
}