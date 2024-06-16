package com.SpringBean.Spring.Bean.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Utils getUtils(){
        return new Utils();
    }

}
