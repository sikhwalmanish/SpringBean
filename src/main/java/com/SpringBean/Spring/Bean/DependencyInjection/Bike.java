package com.SpringBean.Spring.Bean.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Bike")
@Primary
public class Bike implements Vehicle{
    @Override
    public void Drive() {
        System.out.println("Bike is good for short distance");
    }
}
