package com.cursospringavanzado.springbusiness.contextos;

import java.util.Random;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class AppContextInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext appContext) {
		Random rd = new Random();
		int value = rd.nextInt(10);
		String profile = value % 2 == 0 ? "desarrollo" : "produccion";
		ConfigurableEnvironment ce = appContext.getEnvironment();
		ce.addActiveProfile(profile);
	}
}
