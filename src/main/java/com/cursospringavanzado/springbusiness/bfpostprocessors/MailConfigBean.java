package com.cursospringavanzado.springbusiness.bfpostprocessors;

import javax.annotation.PostConstruct;

public class MailConfigBean {
	private String host;
	
	public MailConfigBean() {
		System.out.println("En el constructor del bean: " + getClass().getName());
		System.out.println("Propiedad host: " + host);
	}
	
	@PostConstruct
	public void doInPostConstruct() {
		System.out.println("En el postconstruct del bean: " + getClass().getName());
		System.out.println("Propiedad host: " + host);
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
