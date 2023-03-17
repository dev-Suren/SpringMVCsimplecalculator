package com.letstryspringmvc.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.letstryspringmvc.functions"})
public class LearnSpringConfig {
    @Bean
    public InternalResourceViewResolver getView(){
        InternalResourceViewResolver internalResourceView = new InternalResourceViewResolver();
        internalResourceView.setSuffix(".jsp");
        return internalResourceView;
    }
}
