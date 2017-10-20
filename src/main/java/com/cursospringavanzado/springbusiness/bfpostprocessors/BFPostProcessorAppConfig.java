package com.cursospringavanzado.springbusiness.bfpostprocessors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BFPostProcessorAppConfig {
    @Bean
    MailConfigFactoryPostProcessor mailConfig() {
        return new MailConfigFactoryPostProcessor();
    }
}
