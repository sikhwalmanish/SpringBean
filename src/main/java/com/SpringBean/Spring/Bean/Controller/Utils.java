package com.SpringBean.Spring.Bean.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Utils {

    public Utils() {

        System.out.println("In Utils Class");
    }
}
//In Singleton(By Default)
//com.SpringBean.Spring.Bean.Controller.Utils@75010cf6
//com.SpringBean.Spring.Bean.Controller.Utils@75010cf6

//In Prototype
//com.SpringBean.Spring.Bean.Controller.Utils@eec545d
//com.SpringBean.Spring.Bean.Controller.Utils@57fb6d5a