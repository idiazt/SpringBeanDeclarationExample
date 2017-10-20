package com.cursospringavanzado.springbusiness.contextos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

  @Bean
  @Profile("desarrollo")
  public IProfileService profileServiceDesarrollo() {
      return new ProfileServiceDesarrollo();
  }

  @Bean
  @Profile("produccion")
  public IProfileService profileServiceProduccion() {
      return new ProfileServiceProduccion();
  }
}
