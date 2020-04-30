package com.org.panda.spring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {TestConfig.class})
@Import(TestService03.class)
public class TestConfig {

    @Bean
    public TestService01 testService01(){
        return new TestService01();
    }
}
