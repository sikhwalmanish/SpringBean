package com.SpringBean.Spring.Bean.Controller;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);


    @Value("${my.cost}")
    int cost;
    @Value("${myapp.name}")
    String name;

    @Autowired
    MyConfig myConfig;
    //Utils utils;

    @GetMapping("/hello")
    public Users sayHello(){
        Utils utils = myConfig.getUtils();
        System.out.println("In Utils Class");
        System.out.println(utils);
        return new Users("BhamaShah", 50);
        //return "Life is Beautiful";
    }

    @GetMapping("/hello2")
    public Void sayHello2(){
        Utils utils = myConfig.getUtils();
        System.out.println("In Hello2"+utils);
        return null;
    }

    @GetMapping("/cost")
    public void Cost(){
        System.out.println(cost);
        System.out.println(name);
    }

    @GetMapping("/logs")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
