package com.SpringBean.Spring.Bean.Controller;

import com.sun.net.httpserver.Headers;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.Map;

@RestController
public class OtherController {

    /*@Autowired
    ApplicationContext applicationContext;
    */
    @Autowired
    MyConfig myConfig;
   // Utils  utils;

    @GetMapping("/bye")
    public Users SayBye(@RequestHeader Map<String, String> headers) {
        Utils utils = myConfig.getUtils();
        System.out.println("In Utils Class");
        System.out.println(utils);

        System.out.println(headers);
        /*Headers myHeader = new Headers();
        myHeader.add("Life is ","Key");
        Users users = new Users("Manish",25);

        return new ResponseEntity<>(users, myHeader, HttpStatus.ACCEPTED);
    */
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("BYE-HEADER", "in other controller");

        //return new ResponseEntity<>(new Users("ABC", 10), responseHeaders, HttpStatus.FORBIDDEN);
        return new Users("Manish",24);
    }

    /*@GetMapping("/printBean")
    public String[] printingBean() {
        String[] bean = applicationContext.getBeanDefinitionNames();

    }*/

    /*public void void displayAllBeans() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }*/


 /*   private String[] printBeans() {
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        if (autowireCapableBeanFactory instanceof SingletonBeanRegistry) {
            String[] singletonNames = ((SingletonBeanRegistry) autowireCapableBeanFactory).getSingletonNames();
            for (String singleton : singletonNames) {
                System.out.println(singleton);
            }
            return singletonNames;
        }
        return null;
    }*/

}

/* com.SpringBean.Spring.Bean.Controller.Utils@5f71027e
In Utils Class
In Hello2com.SpringBean.Spring.Bean.Controller.Utils@7f798351
In Utils Class
In Utils Class
com.SpringBean.Spring.Bean.Controller.Utils@148a151d */
