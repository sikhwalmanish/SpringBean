package com.SpringBean.Spring.Bean.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements Vehicle{
    @Override
    public void Drive() {
        System.out.println("Driving Car is amazing");
    }
}
