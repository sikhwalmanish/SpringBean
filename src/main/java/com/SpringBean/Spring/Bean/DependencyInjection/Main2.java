package com.SpringBean.Spring.Bean.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main2 {

    @Autowired
    @Qualifier("Car")
    Vehicle vehicle;

    @GetMapping("/Drive2")
    public void Drive(){
        vehicle.Drive();
    }
}
